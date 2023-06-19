package com.team.devdungeon.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.devdungeon.dao.AdminDAO;
import com.team.devdungeon.dto.AdminDTO;
import com.team.devdungeon.dto.AnswerDTO;
import com.team.devdungeon.dto.BoardDTO;
import com.team.devdungeon.dto.CouponDTO;
import com.team.devdungeon.dto.EventDTO;
import com.team.devdungeon.dto.MemberDTO;
import com.team.devdungeon.dto.QuestionBoardDTO;

@Service
public class AdminService {

	@Autowired
	private AdminDAO adminDAO;

	public AdminDTO adminLogin(AdminDTO adminDTO) {
		return adminDAO.adminLogin(adminDTO);
	}

	public List<Map<String, Object>> adminToday() {
		return adminDAO.adminToday();
	}

	public List<Map<String, Object>> adminDate() {
		return adminDAO.adminDate();
	}

	public List<Map<String, Object>> adminVisitor() {
		return adminDAO.adminVisitor();
	}

	public List<Map<String, Object>> adminMember(Map<String, Object> pages) {
		return adminDAO.adminMember(pages);
	}

	public void memberUpdate(MemberDTO memberDTO) {
		adminDAO.memberUpdate(memberDTO);
	}

	public List<Map<String, Object>> AdminBoard(Map<String, Object> pages) {
		return adminDAO.adminBoard(pages);
	}

	public void adminBoardDel(BoardDTO boardDTO) {
		adminDAO.adminBoardDel(boardDTO);
	}

	public List<Map<String, Object>> AdminBoardDetail(int boardNo) {
		return adminDAO.AdminBoardDetail(boardNo);
	}

	public List<Map<String, Object>> AdminLog(Map<String, Object> pages) {
		return adminDAO.AdminLog(pages);
	}

	public List<Map<String, Object>> LogDay() {
		return adminDAO.LogDay();
	}

	public List<Map<String, Object>> LogTime() {
		return adminDAO.LogTime();
	}

	public List<Map<String, Object>> LogMonth() {
		return adminDAO.LogMonth();
	}

	public List<Map<String, Object>> excelTime() {
		return adminDAO.LogTime();
	}

	public List<Map<String, Object>> excelDay() {
		return adminDAO.LogDay();
	}

	public List<Map<String, Object>> excelMonth() {
		return adminDAO.LogMonth();
	}

	public List<Map<String, Object>> adminCoupon(Map<String, Object> pages) {
		return adminDAO.adminCoupon(pages);
	}

	public void adminCouponCreate(CouponDTO couponDTO) {
		adminDAO.adminCouponCreate(couponDTO);
	}

	public void adminCouponDel(int couponDel) {
		adminDAO.adminCouponDel(couponDel);
	}

	public List<Map<String, Object>> AdminCouponView() {
		return adminDAO.AdminCouponView();
	}

	public List<Map<String, Object>> adminQnA(Map<String, Object> pages) {
		return adminDAO.adminQnA(pages);
	}

	public List<QuestionBoardDTO> Answer(int no) {
		return adminDAO.Answer(no);
	}

	public void adminAnswerComplete(AnswerDTO answerDTO) {
		adminDAO.adminAnswerComplete(answerDTO);
	}

	public void adminAnswerChange(int change) {
		adminDAO.adminAnswerChange(change);
	}

	public List<Map<String, Object>> AdminStore(Map<String, Object> pages) {
		return adminDAO.AdminStore(pages);
	}

	public void amdinStoreChange(Map<String, Object> change) {
		adminDAO.amdinStoreChange(change);
	}

	public List<Map<String, Object>> AdminEvent(Map<String, Object> pages) {
		return adminDAO.AdminEvent(pages);
	}

	public void adminEventDel(EventDTO eventDTO) {
		adminDAO.AdminEventDel(eventDTO);
	}

	public void adminEventModal(EventDTO eventDTO) {
		adminDAO.adminEventModal(eventDTO);
	}

	public void puteventFile(Map<String, Object> fileMap) {
		adminDAO.puteventFile(fileMap);
	}

	public void eventUpdate(Map<String, Object> map) {
		adminDAO.puteventFile(map);
	}

	public void adminEventWrite(EventDTO eventDTO) {
		adminDAO.adminEventWrite(eventDTO);
	}

	public int boardCount(Map<String, Object> pages) {
		return adminDAO.boardCount(pages);
	}

	public int adminMemberCount(Map<String, Object> pages) {
		return adminDAO.adminMemberCount(pages);
	}

	public int adminCouponCount(Map<String, Object> pages) {
		return adminDAO.adminCouponCount(pages);
	}

	public int adminQnACount(Map<String, Object> pages) {
		return adminDAO.adminQnACount(pages);
	}

	public int adminStoreCount(Map<String, Object> pages) {
		return adminDAO.adminStoreCount(pages);
	}

	public int adminEventCount(Map<String, Object> pages) {
		return adminDAO.adminEventCount(pages);
	}

	public int adminLogCount(Map<String, Object> pages) {
		return adminDAO.adminLogCount(pages);
	}

	public List<Map<String, Object>> BanBoard(Map<String, Object> pages) {
		return adminDAO.BanBoard(pages);
	}

	public int banBoardCount(Map<String, Object> pages) {
		return adminDAO.banBoardCount(pages);
	}

}
