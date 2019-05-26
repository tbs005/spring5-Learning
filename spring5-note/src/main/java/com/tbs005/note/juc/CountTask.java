package com.tbs005.note.juc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

//ForkJoinDemo 

public class CountTask extends RecursiveTask<Long> {
	private static final long serialVersionUID = -2939585265218202068L;
	private static final int THRESHOLD = 10000;
	private long start;
	private long end;

	public CountTask(long start, long end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {
		long sum = 0;
		boolean canCompute = (end - start) < THRESHOLD;

		if (canCompute) {
			for (long i = start; i < end; i++) {
				sum += i;
			}
		} else {
			long step = (start + end) / 100;
			ArrayList<CountTask> subTasks = new ArrayList<>();
			long pos = start;
			for (int i = 0; i < 100; i++) {
				long lastOne = pos + step;
				if (lastOne > end)
					lastOne = end;
				CountTask subTask = new CountTask(pos, lastOne);
				pos += step + 1;
				subTasks.add(subTask);
				subTask.fork();
			}

			for (CountTask countTask : subTasks) {
				sum += countTask.join();
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		ForkJoinPool forkJoinPool = new ForkJoinPool();

		CountTask task = new CountTask(0, 200000L);
		ForkJoinTask<Long> result = forkJoinPool.submit(task);

		try {
			Long sum = result.get();
			System.out.println("sum=" + sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------------------");
		
		//常规方式
		long sum2 =0;
		for (long i = 0; i < 200000L; i++) {
			sum2 += i;
		}
		System.out.println("sum2=" + sum2);
	}
}
