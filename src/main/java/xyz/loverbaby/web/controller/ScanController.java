package xyz.loverbaby.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.loverbaby.api.BuildRecordFacade;
import xyz.loverbaby.api.dto.common.CommonResult;
import xyz.loverbaby.api.dto.common.Page;
import xyz.loverbaby.api.dto.request.BuildRecordAddRequest;
import xyz.loverbaby.api.dto.request.BuildRecordPageRequest;
import xyz.loverbaby.api.dto.response.BuildRecordVO;

/**
 * @Classname ScanController
 * @Description
 * @Date 2019/5/20 下午3:06
 * @Created by yccao
 */
@RestController
public class ScanController {

    @Autowired
    private BuildRecordFacade buildRecordFacade;

    @PostMapping("/:saveForBuild")
    public CommonResult<Boolean> insertBuildRecord(@RequestBody BuildRecordAddRequest buildRecordAddRequest) {
        return buildRecordFacade.insertBuildRecord(buildRecordAddRequest);
    }

    @PostMapping("/query")
    public CommonResult<Page<BuildRecordVO>> listBuildRecordPage(BuildRecordPageRequest buildRecordPageRequest) {
        return buildRecordFacade.listBuildRecordByPage(buildRecordPageRequest);
    }
}
