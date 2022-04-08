package mine.mazzanet.shinypancake.controllers;

import mine.mazzanet.shinypancake.repository.OrgRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chrismazza on 4/7/22
 **/
@Controller
public class orgController {

    private final OrgRepository orgRepository;

    public orgController(OrgRepository orgRepository) {
        this.orgRepository = orgRepository;
    }

    @RequestMapping("/orgs")
    public String getOrgs(Model model){

        model.addAttribute("orgs", orgRepository.findAll());

        return "orgs/list";
    }
}
