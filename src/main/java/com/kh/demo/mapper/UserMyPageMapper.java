package com.kh.demo.mapper;

import com.kh.demo.domain.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMyPageMapper {
    //insert
    int insertDiary(DiaryDTO diary);

    //update
    int updateDiary(DiaryDTO diary);

    //delete
    int deleteDiary(Long diary_num);

    //select
    List<DiaryDTO> getDiaryList(String loginUser);
    DiaryDTO getDiaryDetail(Long diary_num);

    DiaryDTO checkList(String choicedate,String loginUser);


    //재우
    //메세지
    Long getMessageTotal(Criteria cri, String userId);

    Long getMessageTotalSend(Criteria cri, String userId);

    Long getMessageTotalReceive(Criteria cri, String userId);

    Long getMessageLastNum(String userid);

    List<MessageDTO> getMyMessageAll(Criteria cri, String userId);

    List<MessageDTO> getMyMessageSend(Criteria cri, String userId);


    List<MessageDTO> getMyMessageReceive(Criteria cri, String userId);

    //보드
    Long getBoardTotal(Criteria cri, String userId);
    
    BoardDTO findBoardByNum(Long boardnum);

    Long getBoardLastNum(String userid);

    List<BoardDTO> getMyBoard(Criteria cri, String userId);

    
    
    //북마크
    Long getBookmarkTotal(Criteria cri, String userId);

    Long getBookmarkProductTotal(Criteria cri, String userId);

    Long getBookmarkLastNum(String userid);

    List<BoardDTO> getMyBookmark(Criteria cri, String userId);

    List<ProductBoardDTO> getMyBookmarkProduct(Criteria cri, String userId);

    
    //내구독
    List<TrainerDTO> getMyScribe(Criteria cri, String userId);

    Long getScribeTotal(Criteria cri, String userId);


    //내챌린지
    Long getChallengeAllAllTotal(Criteria cri, String userId);
    Long getChallengeAllTermTotal(Criteria cri, String userId, String challTerm);
    Long getChallengeCategoryAllTotal(Criteria cri, String userId, String challCategory);
    Long getChallengeCategoryTermTotal(Criteria cri, String userId, String challCategory, String challTerm);


    List<ChallNoticeBoardDTO> getMyChallengeAllAll(Criteria cri, String userId);
    List<ChallNoticeBoardDTO> getMyChallengeAllTerm(Criteria cri, String userId, String challTerm);
    List<ChallNoticeBoardDTO> getMyChallengeCategoryAll(Criteria cri, String userId, String challCategory);
    List<ChallNoticeBoardDTO> getMyChallengeCategoryTerm(Criteria cri, String userId, String challCategory, String challTerm);


    //트레이너신청
    int insertApplytrainer(TrainerSignUpDTO user);

    Long getSignUpLastNum(String userId);



}
