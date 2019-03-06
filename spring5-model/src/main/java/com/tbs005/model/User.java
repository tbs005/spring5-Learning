package com.tbs005.model;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Hello world!
 *
 */
@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class User implements Serializable
{
	private static final long serialVersionUID = -924380702769875678L;

	private Long id;
	
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 邮箱 
     */
    private String email;
    
}
