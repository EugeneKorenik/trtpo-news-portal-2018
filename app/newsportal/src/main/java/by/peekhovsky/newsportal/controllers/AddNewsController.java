package by.peekhovsky.newsportal.controllers;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.security.details.UserDetailsImpl;
import by.peekhovsky.newsportal.transfer.UserDto;
import by.peekhovsky.newsportal.users.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static by.peekhovsky.newsportal.transfer.UserDto.from;

@Controller
public class AddNewsController {

    private final NewsService newsService;

    @Autowired
    public AddNewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @ModelAttribute
    public void checkAuthentication(Authentication authentication, ModelMap model) {
        if (authentication != null) {
            UserDetailsImpl details
                    = (UserDetailsImpl) authentication.getPrincipal();
            UserDto userDto = from(details.getUser());
            model.addAttribute("userDto", userDto);
        }
    }

    @GetMapping("/add")
    public String getMainPage() {
        return "add";
    }

    @PostMapping("/add")
    void addNews(@RequestBody News newNews) {
        newsService
    }

}
