package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/AlreadyBound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u92/6642/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, March 31, 2016 9:04:29 PM PDT
*/

public final class AlreadyBound extends org.omg.CORBA.UserException
{

  public AlreadyBound ()
  {
    super(AlreadyBoundHelper.id());
  } // ctor


  public AlreadyBound (String $reason)
  {
    super(AlreadyBoundHelper.id() + "  " + $reason);
  } // ctor

} // class AlreadyBound
