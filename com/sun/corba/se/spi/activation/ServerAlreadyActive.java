package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u92/6642/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, March 31, 2016 9:04:29 PM PDT
*/

public final class ServerAlreadyActive extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyActive ()
  {
    super(ServerAlreadyActiveHelper.id());
  } // ctor

  public ServerAlreadyActive (int _serverId)
  {
    super(ServerAlreadyActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyActive (String $reason, int _serverId)
  {
    super(ServerAlreadyActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyActive
