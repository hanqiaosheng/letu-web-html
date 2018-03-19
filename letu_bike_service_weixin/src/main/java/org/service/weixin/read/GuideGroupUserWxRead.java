package org.service.weixin.read;

import java.util.List;

public interface GuideGroupUserWxRead {
    /**
     * 根据旅游团id 查找 用户id列表
     * @param guideGroupId
     * @return
     */
    public List<Long> findByGuideGroupId(Long guideGroupId);

    /**
     * 根据用户 查找 旅游团id列表
     * @param userId
     * @return
     */
    public List<Long> findByUserId(Long userId);

    /**
     * 计算用户数
     * @param guideGroupId
     * @return
     */
    public int countByGuideGroupId(Long guideGroupId);

    /**
     * 计算旅游团数量
     * @param userId
     * @return
     */
    public int countByUserId(Long userId);

    /**
     * 通过userid和groupid查找
     * @param userId
     * @return
     */
    public int countByUserIdAndGroupId(Long userId,Long groupId);
}
