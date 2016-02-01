

<HTML>

    <HEAD>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <TITLE>Add new book Form</TITLE>

        <style>

            .error {
                color: #ff0000;
                
            }
        </style>

    </HEAD>

    <body>



        <H1> Add new Book</H1>
        <FORM ACTION="/bibliophile/add" METHOD=POST>
            <H2>Fill out the form</H2>
            <table align="left" wight ="100%" cellspasing="0" sellpadding ="3">
                <tr>
                    <td align="left"> Title:</td> 
                <td><INPUT TYPE=text SIZE=40 NAME=title ></td>
                </tr>
                <tr>
                    <td align="left">Author: </td>
                    <td><INPUT TYPE=text SIZE=40 NAME=author ></td>
                </tr>
                <tr>
                    <td align="left">Category:</td>
                    <td><INPUT TYPE=text SIZE=40 NAME=category ></td>
                <tr>
                    <td><INPUT TYPE=submit VALUE="Save new book"></td>
                </tr>
            </table>
        </FORM>
    
</BODY>
</HTML>


