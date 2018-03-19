package org.service.weixin.read;


import org.entity.dto.UserToTask;

public interface UserToTaskWxServiceRead {
	/**
	 * 通过用户id获取记录
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public UserToTask findByUserIdAndDataId(Long userId,Long dataDetId) throws Exception;
}
