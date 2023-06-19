package com.team.devdungeon.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.team.devdungeon.dao.CSJDAO;
import com.team.devdungeon.dto.CSJshowDTO;

@Service
public class CSJServiceImpl implements CSJService {

	@Autowired
	private CSJDAO csjDAO;
	
	@Override
	public int wow() {
		System.out.println("wow");
		return 1;
	}

	@Override
	public List<Map<String, Object>> boardList() {
		return csjDAO.boardList();
	}

	@Override
	public PageInfo<Map<String, Object>> pageList(Integer pageNo, int i) {
		return csjDAO.pageList(pageNo,i);
	}

	@Override
	public PageInfo<Map<String, Object>> pageList(CSJshowDTO dto) {
		return csjDAO.pageList(dto);
	}

	@Override
	public int write(Map<String, Object> writemap) {
		return csjDAO.write(writemap);
	}

	@Override
	public Map<String, Object> detail(int bno) {
		return csjDAO.detail(bno);
	}

	@Override
	public Map<String, Object> memberProfile(int member_no) {
		return csjDAO.memberProfile(member_no);
	}

	@Override
	public List<Map<String, Object>> commentList(int bno) {
		return csjDAO.commentList(bno);
	}

	@Override
	public int likethis(int bno) {
		return csjDAO.likethis(bno);
	}

	@Override
	public int readthis(int bno) {
		return csjDAO.readthis(bno);
	}

	@Override
	public int commentWrite(Map<String, Object> comment) {
		return csjDAO.commentWrite(comment);
	}

	@Override
	public int ReplyWrite(Map<String, Object> comment) {
		return csjDAO.csjReplyWrite(comment);
	}

	@Override
	public PageInfo<Map<String, Object>> faqList(CSJshowDTO dto) {
		return csjDAO.faqList(dto);
	}

	@Override
	public void userDelete(Map<String, Object> delMap) {
		csjDAO.userDelete(delMap);
	}

	@Override
	public int updateBoard(Map<String, Object> updatemap) {
		return csjDAO.updateBoard(updatemap);
	}

	@Override
	public void banBoard(Map<String, Object> banMap) {
		csjDAO.banBoard(banMap);
	}

	@Override
	public void userCommentDelete(int cno) {
		csjDAO.userCommentDelete(cno);
	}

	@Override
	public void banComment(Map<String, Object> banMap) {
		csjDAO.banComment(banMap);
	}

	@Override
	public PageInfo<Map<String, Object>> eventList(CSJshowDTO dto) {
		return csjDAO.eventList(dto);
	}

	@Override
	public Map<String, Object> eventdetail(int bno) {
		return csjDAO.eventdetail(bno);
	}

	@Override
	public Map<String, Object> callBoardFile(int bno) {
		return csjDAO.callBoardFile(bno);
	}

	@Override
	public void putBoardFile(Map<String, Object> fileMap) {
		csjDAO.putBoardFile(fileMap);
	}

	@Override
	public PageInfo<Map<String, Object>> qnaList(CSJshowDTO dto) {
		return csjDAO.qnaList(dto);
	}

	@Override
	public int qnaWrite(Map<String, Object> map) {
		return csjDAO.qnaWrite(map);
	}

	@Override
	public Map<String, Object> callEventFile(int bno) {
		return csjDAO.callEventFile(bno);
	}

	@Override
	public int eventJoin(Map<String, Object> map) {
		return csjDAO.eventJoin(map);
	}

	@Override
	public void addPoint(Map<String, Object> map) {
		csjDAO.addPoint(map);
	}

	@Override
	public List<Map<String, Object>> eventFive() {
		return csjDAO.eventFive();
	}

	@Override
	public List<Map<String, Object>> boardFive(String string) {
		return csjDAO.boardFive(string);
	}

	@Override
	public String callCommentWriter(int cno) {
		return csjDAO.callCommentWriter(cno);
	}




}
