package kr.co.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.persistence.MemberDAO;

@Service  //객체가 된다. 
public class MemberServiceImpl implements MemberService {

	@Inject  //spring 컨테이너가 이 타입으로 된 객체를 가지고 있다는 뜻! 
	private MemberDAO memberDAO;
	
}
