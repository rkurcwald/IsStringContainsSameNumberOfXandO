package com.github.rkurcwald;

public class XO 
{
	  
	public static boolean getXO (String str) 
	  {
	    int xVal=0,oVal=0;
	    str=str.toLowerCase();
	    if(!str.contains("x") && !str.contains("o"))
	    {
	      return true;
	    }
	    else
	    {
	      for(int i=0; i<str.length();i++)
	      {
	        if(str.charAt(i)-'x'==0)
	        {
	          xVal++;
	        }
	        else if(str.charAt(i)-'o'==0) 
	        {
	          oVal++;
	        }
	      }
	      if(xVal==oVal)
	      {
	        return true;
	      }
	      else
	      {  
	        return false;
	      }
	    }
	  }
	}
