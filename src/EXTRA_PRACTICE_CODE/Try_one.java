package EXTRA_PRACTICE_CODE;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Try_one
{
    public static void main(String[] args)
    {
    	Random random = new Random();
        int otp = 1000+ random.nextInt(9000);
        System.out.println("OTP GENERATED : "+otp);

    }
}
