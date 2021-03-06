/**
 * Copyright 2010 ASTO.
 * All right reserved.
 * Created on 2010-8-24
 */
package com.ast.ast1949.persist.information;

import java.util.List;

import com.ast.ast1949.domain.information.ExhibitDO;
import com.ast.ast1949.dto.PageDto;
import com.ast.ast1949.dto.information.ExhibitDTO;

/**
 * @author yuyonghui
 *
 */
public interface ExhibitDAO {
   
	/**
	 *    后台分页列表查询所有展会
	 * @param exhibitDTO  不能为空
	 *  pageDto 分页参数
	 *  name 按展会名称查询
 	 * @return
	 *  成功返回List<ExhibitDTO> 否则返回null
	 */
	public List<ExhibitDTO> queryExhibitByCondition(ExhibitDTO exhibitDTO);
	 /**
	  * 后台查询展会记录总数
	  * @param exhibitDTO
	  *  name 按展会名称查询
	  * @return  返回记录总数
	  * 
	  */
	public Integer queryExhibitCountByCondition(ExhibitDTO exhibitDTO);
	/**
	 *      按Id查询线下展会信息 包含地区,展会行业名称，模块名称
	 * @param id  不能为空
	 * @return  ExhibitDTO 
	 */
//	public ExhibitDTO queryExhibitById(Integer id);
	/**
	 *   按Id查询线下展会信息
	 * @param id 不能为空
	 * @return ExhibitDO
	 */
	public ExhibitDO selectExhibitById(Integer id);
     /**
      *      根据展会类别查询展会信息
      * @param plateCategoryCode  不能为空
      * @param limitSize    列表显示条数
      * @return  List<ExhibitDO>
      */
	public List<ExhibitDO> queryExhibitByCategoryCode(String plateCategoryCode,String exhibitCategoryCode,Integer limitSize);
	/**
	 *    展会修改
	 * @param exhibitDO
	 *     不能为空
	 * @return    结果集大于0修改成功 否则修改失败
	 */
	public Integer updateExhibit(ExhibitDO exhibitDO);
	/**
	 *    添加展会
	 * @param exhibitDO
	 *     不能为空
	 * @return 结果集大于0添加成功 否则添加失败
	 */
	public Integer insertExhibit(ExhibitDO exhibitDO);
	/**
	 *  按Id 删除展会
	 * @param id 不能为空
	 * @return  大于0删除成功 否则失败
	 */
	public Integer deleteExhibitById(int[] entities);
	
	public List<ExhibitDO> queryExhibit(ExhibitDO exhibitDO, PageDto<ExhibitDTO> page);
	
	public Integer queryExhibitCount(ExhibitDO exhibitDO);
	
	public List<ExhibitDO> queryExhibitByPlateCategory(String plateCategory, Integer max);
	
	public String queryContent(Integer id);
	
	public Integer updateContent(Integer id, String content);
	
	public List<ExhibitDO> queryExhibitByAdmin(ExhibitDO exhibit, PageDto<ExhibitDTO> page);
	
	public Integer queryExhibitByAdminCount(ExhibitDO exhibit);
	
	public Integer deleteExhibit(Integer id);
	
	public List<ExhibitDTO> queryNewestExhibit(String plateCategoryCode,String exhibitCategoryCode, Integer size);
	/**
	 * 上一篇
	 * @param plateCategory
	 * @param gmtCreated
	 * @return
	 */
	
	public ExhibitDO queryUpNews(String plateCategory,String gmtCreated);
	/**
	 * 下一篇
	 * @param plateCategory
	 * @param gmtCreated
	 * @return
	 */
	public ExhibitDO queryDownNews(String plateCategory,String gmtCreated);
}
