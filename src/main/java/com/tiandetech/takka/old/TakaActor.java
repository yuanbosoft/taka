package com.tiandetech.takka.old;

import akka.actor.UntypedActor;

public class TakaActor extends UntypedActor
{
	@Override
	public void onReceive(Object arg0) throws Exception
	{
		System.out.println("Into TakaActor..."+arg0);
	}

}
