package xyz.loverbaby.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.loverbaby.api.BuildRecordFacade;
import xyz.loverbaby.api.dto.common.CommonResult;
import xyz.loverbaby.api.dto.request.BuildRecordAddRequest;

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

    public CommonResult<Boolean> insertBuildRecord(BuildRecordAddRequest buildRecordAddRequest) {
        BuildRecordAddRequest request = new BuildRecordAddRequest();
        request.setProjectName("gtr");
        request.setDescription("desc");
        request.setInsecurity("<project></project>");
        request.setDetailId(1);
        request.setResult("success");
        CommonResult<Boolean> commonResult = buildRecordFacade.insertBuildRecord(request);
        return commonResult;
    }
    @GetMapping("get")
    public CommonResult<Boolean> get() {
        return buildRecordFacade.get();
    }
}
