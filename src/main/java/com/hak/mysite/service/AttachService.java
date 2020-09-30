package com.hak.mysite.service;

import com.hak.base.service.BaseService;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
public interface AttachService extends BaseService {

    String uploadSingleFile(MultipartFile file) throws Exception;

    String uploadMultipleFile(MultipartFile[] files) throws Exception;
}
