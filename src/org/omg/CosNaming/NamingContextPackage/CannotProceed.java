package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/CannotProceed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macosx/zulu-src.git/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, April 18, 2022 8:56:48 AM PDT
*/

public final class CannotProceed extends org.omg.CORBA.UserException
{
  public org.omg.CosNaming.NamingContext cxt = null;
  public org.omg.CosNaming.NameComponent rest_of_name[] = null;

  public CannotProceed ()
  {
    super(CannotProceedHelper.id());
  } // ctor

  public CannotProceed (org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id());
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor


  public CannotProceed (String $reason, org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id() + "  " + $reason);
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor

} // class CannotProceed
