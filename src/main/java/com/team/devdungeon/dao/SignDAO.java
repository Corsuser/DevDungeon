package com.team.devdungeon.dao;

import com.team.devdungeon.dto.SignDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SignDAO {

    @Autowired
    private SqlSession sqlSession;

    public void signup(SignDTO signDTO) {
    sqlSession.insert("sign.signup",signDTO);
    sqlSession.insert("sign.new_account",signDTO);
    sqlSession.insert("sign.signup_agree",signDTO);
    sqlSession.insert("sign.point_new",signDTO);
    }

    public SignDTO checkid(SignDTO signDTO) {
        return sqlSession.selectOne("sign.check",signDTO);
    }

    public void mail_code(SignDTO signDTO) {
        sqlSession.insert("sign.code", signDTO);
    }

    public SignDTO check_code(SignDTO signDTO) {
        return sqlSession.selectOne("sign.check_code",signDTO);
    }

    public SignDTO check_name(SignDTO signDTO) {
        return sqlSession.selectOne("sign.check_name",signDTO);
    }

    public SignDTO check_final(SignDTO signDTO) {
        return sqlSession.selectOne("sign.check_final",signDTO);
    }

    public int accountInquiry(SignDTO signDTO) {
     return sqlSession.update("sign.accountInquiry",signDTO);
    }

    public SignDTO find_account(SignDTO signDTO) {
        return sqlSession.selectOne("sign.check_account", signDTO);
    }

    public int change_pw(SignDTO signDTO) {
        return sqlSession.update("sign.change_pw",signDTO);
    }

    public String getMemberId(String memberEmail) {
        return sqlSession.selectOne("sign.getMemberId", memberEmail);
    }
}
