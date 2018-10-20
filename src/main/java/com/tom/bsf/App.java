package com.tom.bsf;

import com.tom.bsf.options.Handler;

/**
 * base 6 encoder/decoder
 *Des Lauriers 2018-10-18
 */
public class App 
{
    public static void main( String[] args ){
    	
        String result = Handler.coder(args[0], args[1]);
        System.out.println(result);
    }
}
