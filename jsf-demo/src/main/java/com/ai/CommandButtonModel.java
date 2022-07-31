package com.ai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class CommandButtonModel {
	
	private Member member;
	private List<Member> members;
	
	@Inject
	private MemberRepository repo;
	
	
	@PostConstruct
	private void init() {
		member = new Member();
		members = repo.getList();
	}
	
	public String addMember() {
		repo.addMember(member);
		members = repo.getList();
		return "/page4-1?faces-redirect=true";
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	

	
	
}
