package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/InvalidSlot.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macosx/zulu-src.git/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Monday, April 18, 2022 8:56:49 AM PDT
*/

public final class InvalidSlot extends org.omg.CORBA.UserException
{

  public InvalidSlot ()
  {
    super(InvalidSlotHelper.id());
  } // ctor


  public InvalidSlot (String $reason)
  {
    super(InvalidSlotHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidSlot
