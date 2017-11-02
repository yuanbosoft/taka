package com.tiandetech.takka.old;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Test {
	public static void main(String[] args) {
		ActorSystem system =ActorSystem.create("TianDeBlockchain");
		ActorRef actorRef=system.actorOf(Props.create(TakaActor.class),"taka");
		System.out.println("actorRef:"+actorRef.path());
		for(int i=0;i<100;i++)
		{
		actorRef.tell("abcdef", null);
		}
		system.stop(actorRef);
		system.terminate();
	}
}
