package com.tiandetech.tdng.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Test {
	public static void main(String[] args) {
		ActorSystem system =ActorSystem.create("TianDeBlockchain");
		ActorRef actorRef=system.actorOf(Props.create(TakaActor.class),"taka");
		System.out.println("actorRef:"+actorRef.path());
		actorRef.tell("abcdef", null);
		
	}
}
