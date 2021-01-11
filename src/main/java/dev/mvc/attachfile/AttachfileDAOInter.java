package dev.mvc.attachfile;

import java.util.List;

public interface AttachfileDAOInter {
  /**
   * 파일 등록  
   * @param attachfileVO
   * @return
   */
  public int create(AttachfileVO attachfileVO);
  
  /**
   * 전체 이미지 목록
   * @return
   */
  public List<AttachfileVO> list();
  
  /**
   * 조회
   * @param attachfileno
   * @return
   */
  public AttachfileVO read(int attachfileno);
  
  /**
   * contentsno에 따른 파일 목록
   * @param contentsno
   * @return
   */
  public List<AttachfileVO> list_by_contentsno(int contentsno);
  
  /**
   * 삭제
   * @param attachfileno
   * @return
   */
  public int delete(int attachfileno);
  
  /**
   * 부모키별 갯수 산출
   * @param contentsno
   * @return
   */
  public int count_by_contentsno(int contentsno);
  
  /**
   * FK 부모키를 이용한 모든 레코드 삭제 
   * @param contentsno
   * @return
   */
  public int delete_by_contentsno(int contentsno);
  
}


