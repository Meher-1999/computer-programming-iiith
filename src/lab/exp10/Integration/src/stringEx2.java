/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * factorial.java
 *
 * Created on 26 Sep, 2010, 10:09:46 PM
 */

/**
 *
 * @author rvk
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class stringEx2 extends javax.swing.JApplet {

    String[] mainCode = {
        "main(){\n",
	"\tchar str1[100] , str2[100];\n",
	"\tint i , j ;\n",
	"\tscanf(\"%s%s\", str1 , str2 );\n",
	"\ti = 0 ; j = 0 ;\n",
	"\twhile ( str1[i] != 0 && str2[j] !=0){\n",
		"\t\tif ( str1[i] > str2[j] ){",
				"\t\t\tbreak;}\n",
                "\t\tif ( str2[j] > str1[i] ){",
				"\t\t\tbreak;}",
		"\t\ti++ ; j++;",
	"\t}\n",
	"\tif ( str1[i] == 0 && str2[j] == 0 ){",
		"\t\tprintf(\"Strings str2 and str1 are same.\\n\"); }\n",
	"\telse if ( str1[i] > str2[j] ){",
		"\t\tprintf(\"String str1 is greater than str2.\\n\"); }\n",
        "\telse {",
		"\t\tprintf(\"String str2 is greater than str1.\\n\"); }",
       "}"
    };
    
    int state;

    int[] localI ;
    int[] localJ;
    
    int[] lineNumber; // from line in the function (string_match)
    
    int count_line ;
    int next_count;
    

    JPanel[] depth;
    GroupLayout[] depthLayouts;
    JLabel[] nlab;
    JLabel[] nval;
    JLabel[] temp;
    JLabel[] tempres;

    String str1;
    String str2;
//============================================

    /** Initializes the applet factorial */
    public void init() {
        state = 0;      
        count_line = 0;
        next_count = 0 ;
        localI = new int[400];
        localJ = new int[400];
        lineNumber = new int[400];
        
    //==========================================
        depth = new JPanel[25];
        depthLayouts = new GroupLayout[25];
        nlab = new JLabel[25];
        nval = new JLabel[25];
        temp = new JLabel[25];
        tempres = new JLabel[25];


// Initializing the variables used to highlight HANOI CODE ( recurion )
        for( int i = 0 ; i < 50 ; i++ ){
            localI[i]           = -1 ;
            localJ[i]           = -1 ;

            lineNumber[i]       = -1 ;
        }

        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void string_match (String str1 , String str2  ){
        localI[count_line] = 0 ;        localJ[count_line] = 0 ;        lineNumber[count_line] = 5; count_line += 1 ;
 	int i = 0 ; int j = 0 ;        // lin 5
   
        localI[count_line] = i ;        localJ[count_line] = j ;        lineNumber[count_line] = 6; count_line += 1 ;
	while ( i < str1.length() && j < str2.length()){       // line 6

	localI[count_line] = i ;        localJ[count_line] = j ;        lineNumber[count_line] = 7;  count_line += 1 ;
			if ( str1.charAt(i) > str2.charAt(j) ){ // line 7

                localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 8;        count_line += 1 ;
				break;}                     //  line 8

                localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 9;        count_line += 1 ;
                if ( str1.charAt(i) < str2.charAt(j) ){ // line 9

                localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 10;        count_line += 1 ;
				break;}                     //  line 10

                localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 11;        count_line += 1 ;
			i++ ; j++; // line 11

                localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 12;        count_line += 1 ;
	}   // line 12

        localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 13;        count_line += 1 ;
        if ( str1.length() == i && str2.length() == j  ){  // line 13

                localI[count_line] = i ;                localJ[count_line] = j ;     lineNumber[count_line] = 14;        count_line += 1 ;
                localI[count_line] = i ;                localJ[count_line] = j ;      lineNumber[count_line] = 19;        count_line += 1 ;
    //} End Braces of Main line 19
                return;
	} // line 14

        localI[count_line] = i ;                localJ[count_line] = j ;            lineNumber[count_line] = 15;        count_line += 1 ;
	if ( str1.length() != i && (str2.length() == j || (str1.charAt(i) > str2.charAt(j) ))){ // line 15

                localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 16;        count_line += 1 ;
                localI[count_line] = i ;                localJ[count_line] = j ;      lineNumber[count_line] = 19;        count_line += 1 ;
    //} End Braces of Main line 19
                return;
	}                     //  line 16

        localI[count_line] = i ;                localJ[count_line] = j ;             lineNumber[count_line] = 17;        count_line += 1 ;
        if ( str1.length() == i||(str1.charAt(i) < str2.charAt(j)) ){ // line 17

                localI[count_line] = i ;                localJ[count_line] = j ;      lineNumber[count_line] = 18;        count_line += 1 ;
                localI[count_line] = i ;                localJ[count_line] = j ;      lineNumber[count_line] = 19;        count_line += 1 ;
    //} End Braces of Main line 19
                return;
	}        // line 18

}

        
        

    

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        header = new java.awt.Label();
        startButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nValue = new javax.swing.JTextField();
        strtButton = new javax.swing.JToggleButton();
        nextButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        nValue1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codePane = new javax.swing.JEditorPane();
        outputscrollpane = new javax.swing.JScrollPane();
        stringVisualExp21 = new StringVisualExp2();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();

        topPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        header.setAlignment(java.awt.Label.CENTER);
        header.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        header.setText("STRINGS : EXAMPLE 2 - STRING COMPARISON");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        startButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("str1  =  ");

        nValue.setEditable(false);

        strtButton.setText("START");
        strtButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        strtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strtButtonActionPerformed(evt);
            }
        });

        nextButton.setText("NEXT");
        nextButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okButton.setEnabled(false);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        nValue1.setEditable(false);

        jLabel4.setText("str2  =  ");

        javax.swing.GroupLayout startButtonLayout = new javax.swing.GroupLayout(startButton);
        startButton.setLayout(startButtonLayout);
        startButtonLayout.setHorizontalGroup(
            startButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(startButtonLayout.createSequentialGroup()
                        .addComponent(strtButton, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, startButtonLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(startButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(startButtonLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nValue1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addGroup(startButtonLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nValue, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        startButtonLayout.setVerticalGroup(
            startButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startButtonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(startButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(startButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(startButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        codePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        javax.swing.text.html.parser.ParserDelegator workaround = new javax.swing.text.html.parser.ParserDelegator();
        codePane.setContentType("text/html");
        codePane.setEditable(false);
        codePane.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        codePane.setText("<html>\n  <head>\n\n  </head>\n  <body>\n    <h1 style='color:#151b54;'><center>CODE</center></h1>\n    <p style=\"margin-top: 0; \">\n      <pre style='font-size:12;'><b>\nmain(){\n\n\tchar str1[100] , str2[100];\n\n\tint i , j  ;\n\n\tscanf(\"%s%s\", str1 , str2 );\n\n\ti = 0 ; j = 0 ;\n\t\n\twhile ( str1[i] != 0 && str2[j] != 0 ){\n\t\n\t\tif ( str1[i] > str2[j] ){\n\t\t\t break; }\n\n\t\telse if ( str2[j] > str1[i] ){\n\t\t\t break;  } \n\t\ti++ ; j++;\n\t}\n\n\tif ( str1[i] == 0 && str2[j] == 0  ){\n\t\tprintf(\"Strings str2 and str1 are same.\\n\"); }\n\n\telse if ( str1[i] > str2[j]  ){\n\t\tprintf(\"String str1 is greater than str2.\\n\"); }\n\n\telse {\n\t\tprintf(\"String str2 is greater than str1.\\n\"); }\n}\n      </b></pre>\n    </p>\n  </body>\n</html>\n");
        codePane.setAutoscrolls(true);
        jScrollPane1.setViewportView(codePane);

        javax.swing.GroupLayout stringVisualExp21Layout = new javax.swing.GroupLayout(stringVisualExp21);
        stringVisualExp21.setLayout(stringVisualExp21Layout);
        stringVisualExp21Layout.setHorizontalGroup(
            stringVisualExp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        stringVisualExp21Layout.setVerticalGroup(
            stringVisualExp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        outputscrollpane.setViewportView(stringVisualExp21);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OUTPUT VISUALIZATION");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));

        jPanel1.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PROBLEM STATEMENT");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextPane1.setText("    STRING COMPARISON : \n\nGiven Two strings str1 and str2, Find out the relationship between the strings str2 and str1 ?\n");
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INITIALIZE VARIABLE");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))))
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputscrollpane, 0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        int k ;
        next_count++;
        if ( next_count   <= 4 )  // when main is called
        {
        
                String code = new String("<html>  <head>  </head>  <body> <h1 style='color:#151b54;'><center>CODE</center></h1> <p style='margin-top: 0; '> <pre style='font-size:12;'><b>");

         
           // Finding the highlighted lines of the MAIN code
            for( int i = 0 ; i < mainCode.length ; i++ )
            {
                
                    if(i == next_count -1 )
                    {
                        code = code.concat("<span style='color:red;'>" + mainCode[i] + "</span>\n");
                    }
                    //else if(i == next_count -1 )
                   // {

                     //       code = code.concat("<span style='color:red; text-decoration:underline; '>" + mainCode[i] + "</span>\n\n\t");
                    //}
                    else
                    {
                            code = code.concat(mainCode[i]+"\n");
                    }
            }
            
           
                   
            code = code.concat("</b></pre>    </p>  </body></html>");

            codePane.setText(code);
            if ( next_count == 4 )  // str1 and str2 are scaned
            {
                string_match( str1 , str2);
                stringVisualExp21.str1 = new String(str1) ;
                stringVisualExp21.str2 = new String(str2) ;
                stringVisualExp21.l1 = str1.length() ;
                stringVisualExp21.l2 = str2.length() ;
                stringVisualExp21.repaint();
            }
        }
        else if ( next_count == count_line + 4) // Code is completed
        {
                strtButton.setText("START");
                nextButton.setEnabled(false);
                nValue.setEditable(false);
                nValue1.setEditable(false);
                okButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Code Execution is Over.");

                String code = new String("<html>  <head>  </head>  <body> <h1 style='color:#151b54;'><center>CODE</center></h1> <p style='margin-top: 0; '> <pre style='font-size:12;'><b>");

           // Finding the highlighted lines of the MAIN code
                int i = 0 ;
                for(i = 0 ; i < mainCode.length -1; i++ )
                {
                           // code = code.concat("<span style='color:red;'>" + mainCode[i] + "</span>\n\n\t");
                     code = code.concat( mainCode[i] + "\n");
                }
                code = code.concat("<span style='color:red;'>" + mainCode[i] + "</span>\n");
               // code = code.concat("<span style='color:red;'>" + mainCode[i+1] + "</span>\n\n");
                //code = code.concat("<span style='color:red; text-decoration:underline; '>" + mainCode[i] + "</span>");

             
                code = code.concat("</b></pre>    </p>  </body></html>");

                codePane.setText(code);
// Upto here Here Highlighting is Done =========================================================
        //=======================================================================================
             //   outputvis1.init();
             //   init();

        }
        else
        {
            k = next_count - 5 ; // Index
            String code = new String("<html>  <head>  </head>  <body> <h1 style='color:#151b54;'><center>CODE</center></h1> <p style='margin-top: 0; '> <pre style='font-size:12;'><b>");

           // Finding the highlighted lines of the MAIN code
            for( int i = 0 ; i < mainCode.length   ; i++ )
            {
                    if(i == lineNumber[k] - 1)
                    {
                            code = code.concat("<span style='color:red;'>" + mainCode[i] + "</span>\n");
                    }
                  //  else if(i == lineNumber[k] - 1)
                  //  {
                  //          code = code.concat("<span style='color:red; text-decoration:underline; '>" + mainCode[i] + "</span>\n\n\t");
                  //  }
                    else
                    {
                            code = code.concat(mainCode[i]+"\n");
                    }
            }
            
            code = code.concat("</b></pre>    </p>  </body></html>");

            codePane.setText(code);
// Upto here Here Highlighting is Done =========================================================
        //=======================================================================================
            if ( lineNumber[k] == 14)  // Str2 == srt1
            {
                stringVisualExp21.found = 0 ;
            }
            else if ( lineNumber[k] ==  16)  // Str1 > str2
            {
                stringVisualExp21.found = 1 ;
            }
            else if ( lineNumber[k] == 18)  // Str2 > str1
            {
                stringVisualExp21.found = 2 ;
            }
             
             stringVisualExp21.local_i = localI[k] ;
             stringVisualExp21.local_j = localJ[k] ;
             
                     
             stringVisualExp21.repaint();
         
            }
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void strtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strtButtonActionPerformed
        // TODO add your handling code here:
        if(strtButton.getText().compareTo("START") == 0){
          
          strtButton.setText("STOP");
          //nextButton.setEnabled(true);
          nValue.setEditable(true);
          nValue1.setEditable(true);
          okButton.setEnabled(true);
 //init(); =================================================
            state = 0;
            count_line = 0;
            next_count = 0 ;

        // Initializing the variables used to highlight HANOI CODE ( recurion )
            for( int i = 0 ; i < 50 ; i++ ){
                

            }
 //----------------------------------------------------
          stringVisualExp21.init();
          stringVisualExp21.repaint();
          String code = new String("<html>  <head>  </head>  <body> <h1 style='color:#151b54;'><center>CODE</center></h1> <p style='margin-top: 0; '> <pre style='font-size:12;'><b>");

           // Adding MAIN code
            for( int i = 0 ; i < mainCode.length ; i++ )
            {
                  code = code.concat(mainCode[i]+"\n");
            }
            
            code = code.concat("</b></pre>    </p>  </body></html>");
            codePane.setText(code);
        }
        else{
          strtButton.setText("START");
          nextButton.setEnabled(false);
          nValue.setEditable(false);
          nValue1.setEditable(false);
          okButton.setEnabled(false);

          

        }
 }
    {
    }//GEN-LAST:event_strtButtonActionPerformed

 private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
     // TODO add your handling code here:
     
     
     str1 = nValue.getText();
     str2 = nValue1.getText();
    // my_hanoi ( 1 , 2 , 3 ,  n );

     if ( str1.length() <= 7 && str2.length() <= 7 && str2.length() > 0 && str1.length() > 0 )
     {
        nextButton.setEnabled(true);
        okButton.setEnabled(false);
        nValue.setEditable(false);
        nValue1.setEditable(false);
     }
     else
     {
         JOptionPane.showMessageDialog(null, "Maximum String Size allowed is Seven, Minimum Size is One ");
     }
     

 }//GEN-LAST:event_okButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane codePane;
    private java.awt.Label header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField nValue;
    private javax.swing.JTextField nValue1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton okButton;
    private javax.swing.JScrollPane outputscrollpane;
    private javax.swing.JPanel startButton;
    private StringVisualExp2 stringVisualExp21;
    private javax.swing.JToggleButton strtButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

}
