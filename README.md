# Homework 5

Read the instructions carefully before starting working on HW5 Q3

## Overview
Q3 asks you to develop your own hash function utilize AES encrypt algorithm. Below is the high-level processes:

`String input` ---> `your hash function` ---> `String output` 

The output string is a Base64 encoded string represents a 64bits length binary sequence,  for example 

`"hello"` ---> `your hash function` ---> `"M3Ae1J1ICQmpNyE96MQFVIk9ev+S2C+ssRbYWmAiAEsVayeS8yw2j3NqjryGCxz67B/o6y4iutsxDv2R6Rjpaw=="`

## Detail Implementation

In your hash function, you need to design how to manipulate the input string to output the hash value as a 64 bits length binary. After you get the binary sequence, you can simply use the `StringUtil.encodeToString(yourResult)` in `src` to produce the final output. 

So the above process become:

`String input` ---> `your main algorithm` ---> `byte[] res` ---> `StringUtil.encodeToString(res)` ---> `String output`

You can do whatever you want to produce the byte array, the only requirement is it must use AES as a subroutine. To use the AES, you can simply call `AES.encrypt()`. There are two overloads of this function, if you need more, you can implement by yourself refer to my implementation.

## Questions?

Feel free to ask on piazza or come to my TA hours

