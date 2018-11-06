学习研究Java虚拟机，首先要搞明白一个问题就是，什么是虚拟机？

我们都知道java程序必须在虚拟机上运行。那么虚拟机到底是什么呢？先看网上搜索到的比较靠谱的解释：
虚拟机是一种抽象化的计算机，通过在实际的计算机上仿真模拟各种计算机功能来实现的。Java虚拟机有自己完善的硬体架构，如处理器、堆栈、寄存器等，还具有相应的指令系统。JVM屏蔽了与具体操作系统平台相关的信息，使得Java程序只需生成在Java虚拟机上运行的目标代码（字节码），就可以在多种平台上不加修改地运行。

这种解释应该算是正确的，但是只描述了虚拟机的外部行为和功能，并没有针对内部原理做出说明。一般情况下我们不需要知道虚拟机的运行原理，只要专注写java代码就可以了，这也正是虚拟机之所以存在的原因--屏蔽底层操作系统平台的不同并且减少基于原生语言开发的复杂性，使java这门语言能够跨各种平台（只要虚拟机厂商在特定平台上实现了虚拟机），并且简单易用。这些都是虚拟机的外部特性，但是从这些信息来解释虚拟机，未免太笼统了，无法让我们知道内部原理。


既然知道什么是虚拟机了，那么Java虚拟机有是吗特别的吗？答案是，没有区别。

参考资料：
https://blog.csdn.net/weixin_40078053/article/details/80552432
https://www.cnblogs.com/yixianyixian/p/7680321.html
https://blog.csdn.net/qq_41212104/article/details/80723644
https://blog.csdn.net/cherrybomb1111/article/details/75070913
https://blog.csdn.net/ytm15732625529/article/details/80383343
https://blog.csdn.net/A_BlackMoon/article/details/79832141
https://baike.baidu.com/item/java%E8%99%9A%E6%8B%9F%E6%9C%BA/6810577?fr=aladdin
https://www.cnblogs.com/yixianyixian/p/7680321.html

JVM优化/调优
MAT的使用
https://github.com/superhj1987/pragmatic-java-engineer/blob/master/book/chapter8-profile/ready.md