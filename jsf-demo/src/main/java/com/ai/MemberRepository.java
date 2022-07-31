package com.ai;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MemberRepository {

	private List<Member> list;
	
	@PostConstruct
	private void init() {
		list = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	public List<Member> getList() {
		return list;
	}
}
