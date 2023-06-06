package phm.chassiplataforma.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import phm.chassiplataforma.entities.Ads;
import phm.chassiplataforma.entities.Users;
import phm.chassiplataforma.repository.AdsRepository;
import phm.chassiplataforma.repository.UsersRepository;
import phm.chassiplataforma.service.UserService;

@Controller
@AllArgsConstructor
public class UsersController {

    private UserService userService;
    private AdsRepository adsRepository;

    @GetMapping("users/new")
    public String newUser(Model model){
        try {
            Users users = new Users();
            model.addAttribute("users", users);
        }catch (Exception e){
            e.printStackTrace();
            return "index";
        }
        return "sign-up";
    }

    @PostMapping("users")
    public String saveUsers(@ModelAttribute("users") Users users) throws Exception {
        userService.createNewUser(users);
        return "redirect:/users/new";

    }

    @PostMapping("sign-in")
    public String auth(@ModelAttribute("users") Users users){
        if(userService.signIn(users).equals(Boolean.TRUE)){
            return "redirect:/index";
        }else{
            return "login";
        }



    }


    @GetMapping("/index")
    public String getIndex(Model model){
        return "index";

    }

    @GetMapping("/form-ads")
    public String getFormAds(Ads ads){
        return "form-ads";

    }

    @PostMapping("/ads")
    public String saveAds(@ModelAttribute("ads") Ads ads) throws Exception {
        adsRepository.save(ads);
        return "redirect:/ads/new";
    }

    @GetMapping("ads/new")
    public String adsSave(Model model){
        try {
            Ads ads = new Ads();
            model.addAttribute("ads", ads);
        }catch (Exception e){
            e.printStackTrace();
            return "index";
        }
        return "form-ads";
    }

    @GetMapping("login")
    public String getLogin(Users users){
        return "login";
    }




}
