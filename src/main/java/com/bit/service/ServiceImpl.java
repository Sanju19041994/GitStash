package com.bit.service;

public class ServiceImpl implements ServiceI {

	@Override
	public String save() {
		System.out.println("git clone -b <branch name> url");
		System.out.println("git add --a , For stash :  git stash");
		System.out.println("getting back from stash : git stash apply");
		System.out.println("total list of stash : git stash list");
		System.out.println("clear all stash : git stash clear");
		return null;
	}

}
