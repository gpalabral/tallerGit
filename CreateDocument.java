package com.server.ws.jwt_example;

//COMENTARIO MIKE
// MAS OTRO COMENTARIO

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CreateDocument {

    public static void main(String[] args) throws Exception {
        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream(
                new File("createparagraph.docx"));

        //create Paragraph
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("PARAGRAPH 1: At tutorialspoint.com, we strive hard to "
                + "provide quality tutorials for self-learning "
                + "purpose in the domains of Academics, Information "
                + "Technology, Management and Computer Programming Languages.");

        run.setBold(true);
        run.setItalic(true);
        run.setText("Font Style");
        run.addBreak();
        run.addBreak();
        run.addBreak();
        run.addBreak();
        run.addBreak();
        run.addBreak();
        run.addBreak();
        run.addBreak();

        //create Paragraph
        XWPFParagraph paragraph2 = document.createParagraph();
        paragraph2.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run2 = paragraph2.createRun();
        run2.setText("PARAGRAPH 2: At tutorialspoint.com, we strive hard to "
                + "provide quality tutorials for self-learning "
                + "purpose in the domains of Academics, Information "
                + "Technology, Management and Computer Programming Languages.");
        //run2.setTextPosition(100);
        

        document.write(out);
        out.close();
        System.out.println("createparagraph.docx written successfully");
    }

}
