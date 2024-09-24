package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping("/file-upload-form")
    public String about() {
        return "file_upload";
    }


    @RequestMapping(value = "/file-upload-submit", method = RequestMethod.POST)
    public String submitForm(@RequestParam("avatar") CommonsMultipartFile attachment, HttpSession session, Model model) {

        System.out.println("FILE UPLOAD CONTROLLER");
        System.out.println(attachment.getSize());
        System.out.println(attachment.getContentType());
        System.out.println(attachment.getName());
        System.out.println(attachment.getOriginalFilename());
        System.out.println(attachment.getStorageDescription());

        byte[] data = attachment.getBytes();

        String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator + "images" + File.separator + attachment.getOriginalFilename();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            fileOutputStream.write(data);
            fileOutputStream.close();
            System.out.println("FILE UPLOADED");

            model.addAttribute("msg", "File Upload Successful");
            model.addAttribute("filename", attachment.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FILE UPLOADING ERROR");
            model.addAttribute("msg", "Unable to File Upload");
        }

        return "file-success";
    }
}
