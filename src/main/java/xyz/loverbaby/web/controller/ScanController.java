package xyz.loverbaby.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @GetMapping("/:query")
    public CommonResult<Page<BuildRecordVO>> get() {
        BuildRecordPageRequest buildRecordPageRequest = new BuildRecordPageRequest();
        return buildRecordFacade.listBuildRecordByPage(buildRecordPageRequest);
    }
}
