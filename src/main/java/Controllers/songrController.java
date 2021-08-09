package Controllers;

import Models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class songrController {

//    @GetMapping("/")
//    public String getSplashPage(){
//
//    }

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "HelloWorld.html";
    }

    @ResponseBody
    @GetMapping("/capitalize/{word}")
    public String capitalizeWord(@RequestParam String word){
        String cappedWord = "fdasfasfas";
        return cappedWord;
    }

    @GetMapping("/albums")
    public String getAlbums(Model m){
        Album album1 = new Album("8 Mile", "Eminem", 21, 4090, "http://4.bp.blogspot.com/_XOeagKFV-ZM/SsInerbFhXI/AAAAAAAAAP0/PhWkXCNTuYw/s400/Eminem+-+8+Mile+Soundtrack.jpg");
        Album album2 = new Album("Hybrid Theory", "Linkin Park", 16, 2265, "https://i1.wp.com/qoret.com/wp-content/uploads/2019/08/album-linkin-park-%E2%80%93-hybrid-theory.jpg?fit=1280%2C1280&ssl=1");
        Album album3 = new Album("Night Visions", "Imagine Dragons", 11, 2631, "https://cdn.hmv.com/r/w-1280/hmv/files/b7/b7f8a7dc-ad74-4ee2-b086-8e23c46468a4.jpg");
        ArrayList<Album> albumCollection = new ArrayList<Album>();
        albumCollection.add(album1);
        albumCollection.add(album2);
        albumCollection.add(album3);
        m.addAttribute("albumCollection", albumCollection);
        return "AlbumView.html";
    }



}
