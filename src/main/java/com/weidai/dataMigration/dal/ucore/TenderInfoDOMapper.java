/**
 * Copyright (C), 2011-2017, 微贷网.
 */
package com.weidai.dataMigration.dal.ucore;

import com.weidai.ucore.facade.domain.TenderInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wuqi 2017/8/7 0007.
 */
public interface TenderInfoDOMapper {
    int insertBatch(@Param("tenderInfoList") List<TenderInfoDO> tenderInfoDOList);

    int deleteByUid(Integer uid);
}
