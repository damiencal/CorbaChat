package chat;


/**
* chat/NameAlreadyUsed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from chat.idl
* Tuesday, June 16, 2015 4:36:01 PM CEST
*/

public final class NameAlreadyUsed extends org.omg.CORBA.UserException
{

  public NameAlreadyUsed ()
  {
    super(NameAlreadyUsedHelper.id());
  } // ctor


  public NameAlreadyUsed (String $reason)
  {
    super(NameAlreadyUsedHelper.id() + "  " + $reason);
  } // ctor

} // class NameAlreadyUsed
