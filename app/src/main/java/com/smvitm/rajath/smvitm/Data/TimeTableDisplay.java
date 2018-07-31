package com.smvitm.rajath.smvitm.Data;

/**
 * Created by rajat on 03-08-2017.
 */

public class TimeTableDisplay {
    public static String DiplayTimeTable (String branch,String year,String section,String day,String p)
    {
        if (year.equalsIgnoreCase("1st year")){
            switch (section){
                case "A" : if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "PCD (206)";

                        case "p2" : return "ELN (206)";

                        case "p3" : return "CHE (206)";

                        case "p4" : return "MAT (206)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "CHE (103)";

                        case "p2" : return "MAT (103)";

                        case "p3" : return "PCD (103)";

                        case "p4" : return "ELN (103)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHEL / CPL";

                        case "p7" : return "CHEL / CPL";

                        case "p8" : return "CHEL / CPL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "ELN (103)";

                        case "p2" : return "ENG (103)";

                        case "p3" : return "MAT (103)";

                        case "p4" : return "CHE (103)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PCD (206)";

                        case "p7" : return "ELN (206)";

                        case "p8" : return "MAT (206)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "CAED";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (103)";

                        case "p7" : return "PCD (103)";

                        case "p8" : return "CHE (103)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "CHEL / CPL";

                        case "p2" : return "CHEL / CPL";

                        case "p3" : return "CHEL / CPL";

                        case "p4" : return "MAT (206)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "EVS (103)";

                        case "p7" : return "CHE (103)";

                        case "p8" : return "ELN (103)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return "CHEL / CPL";

                        case "p2" : return "CHEL / CPL";

                        case "p3" : return "CHEL / CPL";

                        case "p4" : return "EVS (206)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (103)";

                        case "p7" : return "PCD (103)";

                        case "p8" : return "ELN (103)";

                        default: return "Data Not Available";
                    }

                }


                case "B":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "ELN (105)";

                        case "p2" : return "ENG (105)";

                        case "p3" : return "MAT (105)";

                        case "p4" : return "CHE (105)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PCD (102)";

                        case "p7" : return "ELN (102)";

                        case "p8" : return "MAT (102)";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "CHEL / CPL";

                        case "p2" : return "CHEL / CPL";

                        case "p3" : return "CHEL / CPL";

                        case "p4" : return "MAT (206)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PCD (101)";

                        case "p7" : return "CHE (101)";

                        case "p8" : return "ELN (101)";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "CAED";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (102)";

                        case "p7" : return "EVS (102)";

                        case "p8" : return "CHE (102)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "PCD (104)";

                        case "p2" : return "MAT (104)";

                        case "p3" : return "CHE (104)";

                        case "p4" : return "ELN (104)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHEL / CPL";

                        case "p7" : return "CHEL / CPL";

                        case "p8" : return "CHEL / CPL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "CHE (104)";

                        case "p2" : return "MAT (104)";

                        case "p3" : return "ELN (104)";

                        case "p4" : return "PCD (104)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return "EVS (104)";

                        case "p2" : return "PCD (104)";

                        case "p3" : return "ELN (104)";

                        case "p4" : return "MAT (104)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHEL / CPL";

                        case "p7" : return "CHEL / CPL";

                        case "p8" : return "CHEL / CPL";

                        default: return "Data Not Available";
                    }

                }


                case "C":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "ELN (103)";

                        case "p2" : return "MAT (103)";

                        case "p3" : return "PCD (103)";

                        case "p4" : return "CHE (103)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "ENG (103)";

                        case "p7" : return "ELN (103)";

                        case "p8" : return "MAT (103)";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "CAED";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (103)";

                        case "p7" : return "PCD (103)";

                        case "p8" : return "CHE (103)";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "CHEL / CPL";

                        case "p2" : return "CHEL / CPL";

                        case "p3" : return "CHEL / CPL";

                        case "p4" : return "MAT (103)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "EVS (103)";

                        case "p7" : return "CHE (103)";

                        case "p8" : return "ELN (103)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "CHE (103)";

                        case "p2" : return "ELN (103)";

                        case "p3" : return "MAT (103)";

                        case "p4" : return "PCD (103)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "MAT (103)";

                        case "p2" : return "PCD (103)";

                        case "p3" : return "ELN (103)";

                        case "p4" : return "CHE (103)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHEL / CPL";

                        case "p7" : return "CHEL / CPL";

                        case "p8" : return "CHEL / CPL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return "PCD (103)";

                        case "p2" : return "MAT (103)";

                        case "p3" : return "ELN (103)";

                        case "p4" : return "CHE (103)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }


                case "D":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "MAT (104)";

                        case "p2" : return "PCD (104)";

                        case "p3" : return "CHE (104)";

                        case "p4" : return "ELN (104)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHEL / CPL";

                        case "p7" : return "CHEL / CPL";

                        case "p8" : return "CHEL / CPL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "CHE (104)";

                        case "p2" : return "ELN (104)";

                        case "p3" : return "MAT (104)";

                        case "p4" : return "PCD (104)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "ELN (104)";

                        case "p2" : return "MAT (104)";

                        case "p3" : return "PCD (104)";

                        case "p4" : return "CHE (104)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "ELN (104)";

                        case "p7" : return "MAT (104)";

                        case "p8" : return "ENG (104)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "CHEL / CPL";

                        case "p2" : return "CHEL / CPL";

                        case "p3" : return "CHEL / CPL";

                        case "p4" : return "EVS (104)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHE (104)";

                        case "p7" : return "MAT (104)";

                        case "p8" : return "ELN (104)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "CAED";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHE (104)";

                        case "p7" : return "MAT (104)";

                        case "p8" : return "PCD (104)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "ELN (102)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHE (104)";

                        case "p7" : return "MAT (104)";

                        case "p8" : return "PCD (104)";

                        default: return "Data Not Available";
                    }
                }


                case "E":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "ELE (101)";

                        case "p2" : return "EME (101)";

                        case "p3" : return "PHY (101)";

                        case "p4" : return "CIV (101)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (101)";

                        case "p7" : return "ELE (101)";

                        case "p8" : return "T";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "CIV (101)";

                        case "p2" : return "MAT (101)";

                        case "p3" : return "ELE (101)";

                        case "p4" : return "EME (101)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL / WSL";

                        case "p7" : return "PHYL / WSL";

                        case "p8" : return "PHYL / WSL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "MAT (101)";

                        case "p2" : return "PHY (101)";

                        case "p3" : return "EME (101)";

                        case "p4" : return "ELE (101)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (101)";

                        case "p7" : return "CIV (101)";

                        case "p8" : return "T";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "PHY (101)";

                        case "p2" : return "ELE (101)";

                        case "p3" : return "CIV (101)";

                        case "p4" : return "MAT (101)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "ENG (101)";

                        case "p7" : return "PHY (101)";

                        case "p8" : return "EME (101)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "EME (101)";

                        case "p2" : return "CIV (101)";

                        case "p3" : return "MAT (101)";

                        case "p4" : return "PHY (101)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL / WSL";

                        case "p7" : return "PHYL / WSL";

                        case "p8" : return "PHYL / WSL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return "CIV (101)";

                        case "p2" : return "MAT (101)";

                        case "p3" : return "PHY (101)";

                        case "p4" : return "ELE (101)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL / WSL";

                        case "p7" : return "PHYL / WSL";

                        case "p8" : return "PHYL / WSL";

                        default: return "Data Not Available";
                    }

                }


                case "F":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "CIV (102)";

                        case "p2" : return "MAT (102)";

                        case "p3" : return "ELE (102)";

                        case "p4" : return "EME (102)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL / WSL";

                        case "p7" : return "PHYL / WSL";

                        case "p8" : return "PHYL / WSL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "PHY (102)";

                        case "p2" : return "ENG (102)";

                        case "p3" : return "ELE (102)";

                        case "p4" : return "CIV (102)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (102)";

                        case "p7" : return "PHY (102)";

                        case "p8" : return "EME (102)";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "EME (102)";

                        case "p2" : return "CIV (102)";

                        case "p3" : return "MAT (102)";

                        case "p4" : return "PHY (102)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL / WSL";

                        case "p7" : return "PHYL / WSL";

                        case "p8" : return "PHYL / WSL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "ELE (102)";

                        case "p2" : return "EME (102)";

                        case "p3" : return "PHY (102)";

                        case "p4" : return "MAT (102)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CIV (102)";

                        case "p7" : return "ELE (102)";

                        case "p8" : return "T";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "MAT (102)";

                        case "p2" : return "PHY (102)";

                        case "p3" : return "EME (102)";

                        case "p4" : return "ELE (102)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CIV (102)";

                        case "p7" : return "MAT (102)";

                        case "p8" : return "T";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return "MAT (102)";

                        case "p2" : return "PHYL / WSL";

                        case "p3" : return "PHYL / WSL";

                        case "p4" : return "PHYL / WSL";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "ELE (102)";

                        case "p7" : return "PHY (102)";

                        case "p8" : return "CIV (102)";

                        default: return "Data Not Available";
                    }

                }


                case "G":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "PHYL / WSL";

                        case "p2" : return "PHYL / WSL";

                        case "p3" : return "PHYL / WSL";

                        case "p4" : return "CIV (205)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT (105)";

                        case "p7" : return "ELE (105)";

                        case "p8" : return "EME (105)";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "PHY (105)";

                        case "p2" : return "ELE (105)";

                        case "p3" : return "EME (105)";

                        case "p4" : return "MAT (105)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "ENG (105)";

                        case "p7" : return "PHY (105)";

                        case "p8" : return "T";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "MAT (105)";

                        case "p2" : return "CIV (105)";

                        case "p3" : return "ELE (105)";

                        case "p4" : return "EME (105)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHY (105)";

                        case "p7" : return "MAT (105)";

                        case "p8" : return "CIV (105)";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "EME (105)";

                        case "p2" : return "PHY (105)";

                        case "p3" : return "MAT (105)";

                        case "p4" : return "CIV (105)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL / WSL";

                        case "p7" : return "PHYL / WSL";

                        case "p8" : return "PHYL / WSL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "CIV (105)";

                        case "p2" : return "ELE (105)";

                        case "p3" : return "PHY (105)";

                        case "p4" : return "MAT (105)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "ELE (105)";

                        case "p7" : return "EME (105)";

                        case "p8" : return "T";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return "MAT (105)";

                        case "p2" : return "ENG (105)";

                        case "p3" : return "CIV (105)";

                        case "p4" : return "EME (105)";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHY (105)";

                        case "p7" : return "ELE (105)";

                        case "p8" : return "T";

                        default: return "Data Not Available";
                    }

                }


                 default: return "Data Not Available";
            }

        }else {


            if (branch.equalsIgnoreCase("Civil Engineering")) {
                if(year.equalsIgnoreCase("2nd year")){
                    if(day.equalsIgnoreCase("Monday")){
                        switch (p){
                            case "p1" : return "CT";

                            case "p2" : return "BGE";

                            case "p3" : return "MAT";

                            case "p4" : return "ADS";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "EG / FM&HM LAB";

                            case "p7" : return "EG / FM&HM LAB";

                            case "p8" : return "EG / FM&HM LAB";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Tuesday")){
                        switch (p){
                            case "p1" : return "ADS";

                            case "p2" : return "AH";

                            case "p3" : return "AS";

                            case "p4" : return "MAT";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "EG / FM&HM LAB";

                            case "p7" : return "EG / FM&HM LAB";

                            case "p8" : return "EG / FM&HM LAB";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Wednesday")){
                        switch (p){
                            case "p1" : return "MAT";

                            case "p2" : return "AS";

                            case "p3" : return "CT";

                            case "p4" : return "BGE";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "ADS";

                            case "p7" : return "ENGLISH";

                            case "p8" : return "ENGLISH";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Thursday")){
                        switch (p){
                            case "p1" : return "EG / FM&HM LAB";

                            case "p2" : return "EG / FM&HM LAB";

                            case "p3" : return "EG / FM&HM LAB";

                            case "p4" : return "CT";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "MAT";

                            case "p7" : return "AH";

                            case "p8" : return "AS";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Friday")){
                        switch (p){
                            case "p1" : return "AH";

                            case "p2" : return "BGE";

                            case "p3" : return "AS";

                            case "p4" : return "ADS";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "AH";

                            case "p7" : return "BGE";

                            case "p8" : return "CT";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Saturday")){
                        switch (p){
                            case "p1" : return "AH";

                            case "p2" : return "CT";

                            case "p3" : return "MAT";

                            case "p4" : return "ADS";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "AS";

                            case "p7" : return "BGE";

                            case "p8" : return "T";

                            default: return "Data Not Available";
                        }

                    }

                }else if (year.equalsIgnoreCase("3rd year")){
                    if(day.equalsIgnoreCase("Monday")){
                        switch (p){
                            case "p1" : return "HE";

                            case "p2" : return "CM & E";

                            case "p3" : return "EPM";

                            case "p4" : return "ABM /GIT";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "WS & TW";

                            case "p7" : return "DSS";

                            case "p8" : return "HE";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Tuesday")){
                        switch (p){
                            case "p1" : return "EPM";

                            case "p2" : return "SURVEY / SA LAB";

                            case "p3" : return "SURVEY / SA LAB";

                            case "p4" : return "SURVEY / SA LAB";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "WS & TE";

                            case "p7" : return "DSS";

                            case "p8" : return "T";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Wednesday")){
                        switch (p){
                            case "p1" : return "WS & TW";

                            case "p2" : return "DSS";

                            case "p3" : return "DSS";

                            case "p4" : return "CM & E";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "HE";

                            case "p7" : return "ABM / GIT";

                            case "p8" : return "WS & TE";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Thursday")){
                        switch (p){
                            case "p1" : return "SOFT SKILL";

                            case "p2" : return "SOFT SKILL";

                            case "p3" : return "CM & E";

                            case "p4" : return "ABM / GIT";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "SURVEY / SA LAB";

                            case "p7" : return "SURVEY / SA LAB";

                            case "p8" : return "SURVEY / SA LAB";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Friday")){
                        switch (p){
                            case "p1" : return "WS & TE";

                            case "p2" : return "CM & E";

                            case "p3" : return "ABM / GIT";

                            case "p4" : return "DSS";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "EPM";

                            case "p7" : return "HE";

                            case "p8" : return "T";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Saturday")){
                        switch (p){
                            case "p1" : return "HE";

                            case "p2" : return "CM & E";

                            case "p3" : return "T";

                            case "p4" : return "T";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "SEMINAR / MINI PROJECT";

                            case "p7" : return "SEMINAR / MINI PROJECT";

                            case "p8" : return "SEMINAR / MINI PROJECT";

                            default: return "Data Not Available";
                        }

                    }

                }else if (year.equalsIgnoreCase("4th year")){
                    if(day.equalsIgnoreCase("Monday")){
                        switch (p){
                            case "p1" : return "PW";

                            case "p2" : return "PW";

                            case "p3" : return "PW";

                            case "p4" : return "PW";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "PW";

                            case "p7" : return "PW";

                            case "p8" : return "PW";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Tuesday")){
                        switch (p){
                            case "p1" : return "PW";

                            case "p2" : return "PW";

                            case "p3" : return "PW";

                            case "p4" : return "PW";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "PW";

                            case "p7" : return "PW";

                            case "p8" : return "PW";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Wednesday")){
                        switch (p){
                            case "p1" : return "SEMINAR";

                            case "p2" : return "SEMINAR";

                            case "p3" : return "UTP / EIA";

                            case "p4" : return "ACT";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "PD / IWWT";

                            case "p7" : return "ACT";

                            case "p8" : return "PD / IWWT";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Thursday")){
                        switch (p){
                            case "p1" : return "PD / IWWT";

                            case "p2" : return "UTP / EIA";

                            case "p3" : return "DDSS";

                            case "p4" : return "UTP / EIA";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "SEMINAR";

                            case "p7" : return "SEMINAR";

                            case "p8" : return "ACT";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Friday")){
                        switch (p){
                            case "p1" : return "DDSS";

                            case "p2" : return "PD / IWWT";

                            case "p3" : return "ACT";

                            case "p4" : return "UTP / EIA";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "DDSS";

                            case "p7" : return "DDSS";

                            case "p8" : return "DDSS";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Saturday")){
                        switch (p){
                            case "p1" : return "PW";

                            case "p2" : return "PW";

                            case "p3" : return "PW";

                            case "p4" : return "PW";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "PW";

                            case "p7" : return "PW";

                            case "p8" : return "PW";

                            default: return "Data Not Available";
                        }

                    }
                }







            } else if (branch.equalsIgnoreCase("Computer Science and Engineering")) {

                if(year.equalsIgnoreCase("2nd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "OOC";

                                case "p2" : return "DAA";

                                case "p3" : return "DC";

                                case "p4" : return "MP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DAA / MP LAB";

                                case "p7" : return "DAA / MP LAB";

                                case "p8" : return "DAA / MP LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "DAA";

                                case "p2" : return "SE";

                                case "p3" : return "MATHS";

                                case "p4" : return "DC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SE";

                                case "p7" : return "MP";

                                case "p8" : return "OOC";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "DC";

                                case "p2" : return "MATHS";

                                case "p3" : return "OOC";

                                case "p4" : return "MP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DAA";

                                case "p7" : return "ENGLISH";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "MP";

                                case "p2" : return "SE";

                                case "p3" : return "OOC";

                                case "p4" : return "DAA";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DAA / MP LAB";

                                case "p7" : return "DAA / MP LAB";

                                case "p8" : return "DAA / MP LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DAA / MP LAB";

                                case "p2" : return "DAA / MP LAB";

                                case "p3" : return "DAA / MP LAB";

                                case "p4" : return "MATHS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SE";

                                case "p7" : return "MATHS";

                                case "p8" : return "DC";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "DAA";

                                case "p2" : return "MATHS";

                                case "p3" : return "MATHS";

                                case "p4" : return "T";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DAA / MP LAB";

                                case "p7" : return "DAA / MP LAB";

                                case "p8" : return "DAA / MP LAB";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "OOC";

                                case "p2" : return "DAA";

                                case "p3" : return "MP";

                                case "p4" : return "MATHS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SE";

                                case "p7" : return "MP";

                                case "p8" : return "DC";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "MATHS";

                                case "p2" : return "DC";

                                case "p3" : return "OOC";

                                case "p4" : return "DAA";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DAA / MP LAB";

                                case "p7" : return "DAA / MP LAB";

                                case "p8" : return "DAA / MP LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "DC";

                                case "p2" : return "MP";

                                case "p3" : return "OOC";

                                case "p4" : return "SE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MATHS";

                                case "p7" : return "ENGLISH";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DAA / MP LAB";

                                case "p2" : return "DAA / MP LAB";

                                case "p3" : return "DAA / MP LAB";

                                case "p4" : return "SE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OOC";

                                case "p7" : return "MATHS";

                                case "p8" : return "DAA";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DAA";

                                case "p2" : return "DC";

                                case "p3" : return "SE";

                                case "p4" : return "MP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DAA / MP LAB";

                                case "p7" : return "DAA / MP LAB";

                                case "p8" : return "DAA / MP LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "DAA / MP LAB";

                                case "p2" : return "DAA / MP LAB";

                                case "p3" : return "DAA / MP LAB";

                                case "p4" : return "DC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MP";

                                case "p7" : return "MATHS";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("3rd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "OS";

                                case "p2" : return "SS";

                                case "p3" : return "PAP / MAD";

                                case "p4" : return "OR / DM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CNS";

                                case "p7" : return "CG";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "PAP / MAD";

                                case "p2" : return "OS";

                                case "p3" : return "SS";

                                case "p4" : return "CG";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OR /DM";

                                case "p7" : return "P";

                                case "p8" : return "P";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "CG / SS LAB";

                                case "p2" : return "CG / SS LAB";

                                case "p3" : return "CG / SS LAB";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "OR / DM";

                                case "p6" : return "CG";

                                case "p7" : return "OS";

                                case "p8" : return "CNS";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "CNS";

                                case "p2" : return "CG";

                                case "p3" : return "SS";

                                case "p4" : return "T";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CG / SS LAB";

                                case "p7" : return "CG / SS LAB";

                                case "p8" : return "CG / SS LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "CG / SS LAB";

                                case "p2" : return "CG / SS LAB";

                                case "p3" : return "CG / SS LAB";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "CNS";

                                case "p6" : return "PAP / MAD";

                                case "p7" : return "OS";

                                case "p8" : return "SS";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "SS";

                                case "p2" : return "CG";

                                case "p3" : return "OS";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "CG / SS LAB";

                                case "p6" : return "CG / SS LAB";

                                case "p7" : return "CG / SS LAB";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "OS (204)";

                                case "p2" : return "SS (204)";

                                case "p3" : return "PAP(205) / MAD(204)";

                                case "p4" : return "OR(203) / DM(204)";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CG / SS LAB";

                                case "p7" : return "CG / SS LAB";

                                case "p8" : return "CG / SS LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "PAP(205) / MAD(204)";

                                case "p2" : return "CNS (204)";

                                case "p3" : return "P (204)";

                                case "p4" : return "P (204)";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OR(203) / DM(204)";

                                case "p7" : return "CG(204)";

                                case "p8" : return "SS(204)";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "CG(203)";

                                case "p2" : return "CNS(203)";

                                case "p3" : return "OS(203)";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "OR(203) /DM(205)";

                                case "p6" : return "CG / SS LAB";

                                case "p7" : return "CG / SS LAB";

                                case "p8" : return "CG / SS LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "CG / SS LAB";

                                case "p2" : return "CG / SS LAB";

                                case "p3" : return "CG / SS LAB";

                                case "p4" : return "CNS (203)";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SS (203)";

                                case "p7" : return "OS (203)";

                                case "p8" : return "CG (203)";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "SS (201)";

                                case "p2" : return "CG (201)";

                                case "p3" : return "OS (201)";

                                case "p4" : return "T";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PAP(202) / MAD(206)";

                                case "p7" : return "CNS (202)";

                                case "p8" : return "T (202)";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "CG / SS LAB";

                                case "p2" : return "CG / SS LAB";

                                case "p3" : return "CG / SS LAB";

                                case "p4" : return "CG (204)";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OS (204)";

                                case "p7" : return "SS (204)";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("4th year")) {
                    switch (section) {
                        case "A":
                            if (day.equalsIgnoreCase("Monday")) {
                                switch (p){
                                    case "p1" : return "Project Work";

                                    case "p2" : return "Project Work";

                                    case "p3" : return "Project Work";

                                    case "p4" : return "Project Work";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "Project Work";

                                    case "p7" : return "Project Work";

                                    case "p8" : return "Project Work";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Tuesday")) {
                                switch (p){
                                    case "p1" : return "Project Work";

                                    case "p2" : return "Project Work";

                                    case "p3" : return "Project Work";

                                    case "p4" : return "Project Work";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "Project Work";

                                    case "p7" : return "Project Work";

                                    case "p8" : return "Project Work";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Wednesday")) {
                                switch (p){
                                    case "p1" : return "SA";

                                    case "p2" : return "SMS";

                                    case "p3" : return "WN / INS";

                                    case "p4" : return "CGC / ST";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "SEMINAR";

                                    case "p7" : return "SEMINAR";

                                    case "p8" : return "SEMINAR";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Thursday")) {
                                switch (p){
                                    case "p1" : return "WN / INS";

                                    case "p2" : return "CGC / ST";

                                    case "p3" : return "SA";

                                    case "p4" : return "Lunch Break";

                                    case "p5" : return "CGC / ST";

                                    case "p6" : return "WN / INS";

                                    case "p7" : return "SMS";

                                    case "p8" : return "SEMINAR";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Friday")) {
                                switch (p){
                                    case "p1" : return "SMS";

                                    case "p2" : return "SA";

                                    case "p3" : return "WN / INS";

                                    case "p4" : return "CGC / ST";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "SMS";

                                    case "p7" : return "SA";

                                    case "p8" : return "SEMINAR";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Saturday")) {
                                switch (p){
                                    case "p1" : return "";

                                    case "p2" : return "";

                                    case "p3" : return "";

                                    case "p4" : return "";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "";

                                    case "p7" : return "";

                                    case "p8" : return "";

                                    default: return "Data Not Available";
                                }

                            }


                        case "B":
                            if (day.equalsIgnoreCase("Monday")) {
                                switch (p){
                                    case "p1" : return "Project Work";

                                    case "p2" : return "Project Work";

                                    case "p3" : return "Project Work";

                                    case "p4" : return "Project Work";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "Project Work";

                                    case "p7" : return "Project Work";

                                    case "p8" : return "Project Work";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Tuesday")) {
                                switch (p){
                                    case "p1" : return "Project Work";

                                    case "p2" : return "Project Work";

                                    case "p3" : return "Project Work";

                                    case "p4" : return "Project Work";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "Project Work";

                                    case "p7" : return "Project Work";

                                    case "p8" : return "Project Work";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Wednesday")) {
                                switch (p){
                                    case "p1" : return "SMS";

                                    case "p2" : return "SA";

                                    case "p3" : return "WN / INS";

                                    case "p4" : return "CGC / ST";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "SEMINAR";

                                    case "p7" : return "SEMINAR";

                                    case "p8" : return "SEMINAR";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Thursday")) {
                                switch (p){
                                    case "p1" : return "WN / INS";

                                    case "p2" : return "CGC / ST";

                                    case "p3" : return "SA";

                                    case "p4" : return "Lunch Break";

                                    case "p5" : return "CGC / ST";

                                    case "p6" : return "WN / INS";

                                    case "p7" : return "SMS";

                                    case "p8" : return "SEMINAR";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Friday")) {
                                switch (p){
                                    case "p1" : return "SA";

                                    case "p2" : return "SMS";

                                    case "p3" : return "WN / INS";

                                    case "p4" : return "CGC / ST";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "SMS";

                                    case "p7" : return "SA";

                                    case "p8" : return "SEMINAR";

                                    default: return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Saturday")) {
                                switch (p){
                                    case "p1" : return "";

                                    case "p2" : return "";

                                    case "p3" : return "";

                                    case "p4" : return "";

                                    case "p5" : return "Lunch Break";

                                    case "p6" : return "";

                                    case "p7" : return "";

                                    case "p8" : return "";

                                    default: return "Data Not Available";
                                }

                            }

                        default:
                            return "Data Not Available";
                    }
                }

                } else if (branch.equalsIgnoreCase("Electronics and Communication Engineering")) {

                if(year.equalsIgnoreCase("2nd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "MP";

                                case "p2" : return "MAT";

                                case "p3" : return "SS";

                                case "p4" : return "CS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "LIC";

                                case "p7" : return "PCS";

                                case "p8" : return "MP";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "LIC&C / MP LAB";

                                case "p2" : return "LIC&C / MP LAB";

                                case "p3" : return "LIC&C / MP LAB";

                                case "p4" : return "SS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PCS";

                                case "p7" : return "MAT";

                                case "p8" : return "LIC";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "PCS";

                                case "p2" : return "LIC";

                                case "p3" : return "SS";

                                case "p4" : return "MP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CS";

                                case "p7" : return "ENGLISH";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "LIC&C / MP LAB";

                                case "p2" : return "LIC&C / MP LAB";

                                case "p3" : return "LIC&C / MP LAB";

                                case "p4" : return "LIC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MAT";

                                case "p7" : return "PCS";

                                case "p8" : return "CS";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "MAT";

                                case "p2" : return "SS";

                                case "p3" : return "MP";

                                case "p4" : return "CS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "LIC&C / MP LAB";

                                case "p7" : return "LIC&C / MP LAB";

                                case "p8" : return "LIC&C / MP LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "LIC&C / MP LAB";

                                case "p2" : return "LIC&C / MP LAB";

                                case "p3" : return "LIC&C / MP LAB";

                                case "p4" : return "MAT";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MAT";

                                case "p7" : return "SS";

                                case "p8" : return "PCS";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "LIC&C / MP LAB";

                                case "p2" : return "LIC&C / MP LAB";

                                case "p3" : return "LIC&C / MP LAB";

                                case "p4" : return "MP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "LIC";

                                case "p7" : return "MAT";

                                case "p8" : return "PCS";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "CS";

                                case "p2" : return "MAT";

                                case "p3" : return "LIC";

                                case "p4" : return "SS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "LIC&C / MP LAB";

                                case "p7" : return "LIC&C / MP LAB";

                                case "p8" : return "LIC&C / MP LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "MP";

                                case "p2" : return "PCS";

                                case "p3" : return "SS";

                                case "p4" : return "LIC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CS";

                                case "p7" : return "ENGLISH";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "MAT";

                                case "p2" : return "PCS";

                                case "p3" : return "CS";

                                case "p4" : return "MP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "LIC&C / MP LAB";

                                case "p7" : return "LIC&C / MP LAB";

                                case "p8" : return "LIC&C / MP LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "SS";

                                case "p2" : return "CS";

                                case "p3" : return "PCS";

                                case "p4" : return "MAT";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MP";

                                case "p7" : return "SS";

                                case "p8" : return "LIC";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "SS";

                                case "p2" : return "CS";

                                case "p3" : return "MAT";

                                case "p4" : return "PCS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "LIC&C / MP LAB";

                                case "p7" : return "LIC&C / MP LAB";

                                case "p8" : return "LIC&C / MP LAB";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("3rd year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "CCN";

                                case "p2" : return "DSS / ME";

                                case "p3" : return "PAP / ST";

                                case "p4" : return "ARM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "VLSI";

                                case "p7" : return "CCN";

                                case "p8" : return "DC";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "PAP / ST";

                                case "p2" : return "ARM";

                                case "p3" : return "CCN";

                                case "p4" : return "VLSI";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DSS / ME";

                                case "p7" : return "DC";

                                case "p8" : return "-";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "VLSI";

                                case "p2" : return "ARM";

                                case "p3" : return "P";

                                case "p4" : return "P";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ARM / CN LAB";

                                case "p7" : return "ARM / CN LAB";

                                case "p8" : return "ARM / CN LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DSS / ME";

                                case "p2" : return "DC";

                                case "p3" : return "CCN";

                                case "p4" : return "ARM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ARM / CN LAB";

                                case "p7" : return "ARM / CN LAB";

                                case "p8" : return "ARM / CN LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "ARM / CN LAB";

                                case "p2" : return "ARM / CN LAB";

                                case "p3" : return "ARM / CN LAB";

                                case "p4" : return "DC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PAP / ST";

                                case "p7" : return "DSS / ME";

                                case "p8" : return "VLSI";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "PAP / ST";

                                case "p2" : return "ARM / CN LAB";

                                case "p3" : return "ARM / CN LAB";

                                case "p4" : return "ARM / CN LAB";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DC";

                                case "p7" : return "VLSI";

                                case "p8" : return "ARM";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "CCN";

                                case "p2" : return "DSS / ME";

                                case "p3" : return "PAP / ST";

                                case "p4" : return "ARM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ARM / CN LAB";

                                case "p7" : return "ARM / CN LAB";

                                case "p8" : return "ARM / CN LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "PAP / ST";

                                case "p2" : return "ARM";

                                case "p3" : return "CCN";

                                case "p4" : return "DC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DSS / ME";

                                case "p7" : return "VLSI";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "ARM / CN LAB";

                                case "p2" : return "ARM / CN LAB";

                                case "p3" : return "ARM / CN LAB";

                                case "p4" : return "CCN";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DC";

                                case "p7" : return "P";

                                case "p8" : return "P";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DSS / ME";

                                case "p2" : return "ARM / CN LAB";

                                case "p3" : return "ARM / CN LAB";

                                case "p4" : return "ARM / CN LAB";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DC";

                                case "p7" : return "ARM";

                                case "p8" : return "VLSI";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DC";

                                case "p2" : return "VLSI";

                                case "p3" : return "ARM";

                                case "p4" : return "VLSI";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PAP / ST";

                                case "p7" : return "DSS / ME";

                                case "p8" : return "CCN";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "PAP / ST";

                                case "p2" : return "DC";

                                case "p3" : return "VLSI";

                                case "p4" : return "ARM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ARM / CN LAB";

                                case "p7" : return "ARM / CN LAB";

                                case "p8" : return "ARM / CN LAB";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("4th year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "PW";

                                case "p2" : return "PW";

                                case "p3" : return "PW";

                                case "p4" : return "PW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "DSS";

                                case "p2" : return "NS";

                                case "p3" : return "GSM / MMC";

                                case "p4" : return "WC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SEM";

                                case "p7" : return "SEM";

                                case "p8" : return "SEM";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "DSS";

                                case "p2" : return "GSM / MMC";

                                case "p3" : return "WC";

                                case "p4" : return "NS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SEM";

                                case "p7" : return "SEM";

                                case "p8" : return "SEM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DSS";

                                case "p2" : return "NS";

                                case "p3" : return "WC";

                                case "p4" : return "GSM / MMC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "WC";

                                case "p2" : return "DSS";

                                case "p3" : return "NS";

                                case "p4" : return "GSM / MMC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "PW";

                                case "p2" : return "PW";

                                case "p3" : return "PW";

                                case "p4" : return "PW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "WC";

                                case "p2" : return "DSS";

                                case "p3" : return "GSM / MMC";

                                case "p4" : return "NS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "DSS";

                                case "p2" : return "GSM / MMC";

                                case "p3" : return "NS";

                                case "p4" : return "WC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DSS";

                                case "p2" : return "WC";

                                case "p3" : return "NS";

                                case "p4" : return "GSM / MMC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SEM";

                                case "p7" : return "SEM";

                                case "p8" : return "SEM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "WC";

                                case "p2" : return "NS";

                                case "p3" : return "DSS";

                                case "p4" : return "GSM / MMC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SEM";

                                case "p7" : return "SEM";

                                case "p8" : return "SEM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }

            } else if (branch.equalsIgnoreCase("Mechanical Engineering")){

                if(year.equalsIgnoreCase("2nd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "FM";

                                case "p2" : return "ATD";

                                case "p3" : return "KOM";

                                case "p4" : return "M&M";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "M&M / M/S LAB";

                                case "p7" : return "M&M / M/S LAB";

                                case "p8" : return "M&M / M/S LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "KOM";

                                case "p2" : return "MAT";

                                case "p3" : return "ATD";

                                case "p4" : return "FM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MTO";

                                case "p7" : return "ENGLISH";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "FM";

                                case "p2" : return "M&M";

                                case "p3" : return "MTO";

                                case "p4" : return "MAT";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "KOM";

                                case "p7" : return "MTO";

                                case "p8" : return "ATD";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "MAT";

                                case "p2" : return "FM";

                                case "p3" : return "KOM";

                                case "p4" : return "ATD";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "M&M / M/S LAB";

                                case "p7" : return "M&M / M/S LAB";

                                case "p8" : return "M&M / M/S LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "KOM";

                                case "p2" : return "M&M";

                                case "p3" : return "ATD";

                                case "p4" : return "M&M";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MAT";

                                case "p7" : return "MTO";

                                case "p8" : return "FM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "KOM";

                                case "p2" : return "MAT";

                                case "p3" : return "FM";

                                case "p4" : return "MTO";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "M&M";

                                case "p7" : return "ATD";

                                case "p8" : return "FM";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "MAT";

                                case "p2" : return "FM";

                                case "p3" : return "KOM";

                                case "p4" : return "ATD";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "M&M";

                                case "p7" : return "ENGLISH";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "KOM";

                                case "p2" : return "FM";

                                case "p3" : return "ATD";

                                case "p4" : return "MTO";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "M&M / M/S LAB";

                                case "p7" : return "M&M / M/S LAB";

                                case "p8" : return "M&M / M/S LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "ATD";

                                case "p2" : return "MTO";

                                case "p3" : return "M&M";

                                case "p4" : return "FM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MAT";

                                case "p7" : return "KOM";

                                case "p8" : return "MTO";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "ATD";

                                case "p2" : return "KOM";

                                case "p3" : return "M&M";

                                case "p4" : return "MAT";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "M&M / M/S LAB";

                                case "p7" : return "M&M / M/S LAB";

                                case "p8" : return "M&M / M/S LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("3rd year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "DME";

                                case "p2" : return "CIM";

                                case "p3" : return "OE";

                                case "p4" : return "FEM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "HT";

                                case "p7" : return "CIM";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "OE";

                                case "p2" : return "HT";

                                case "p3" : return "DME";

                                case "p4" : return "AE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CIM";

                                case "p7" : return "FEM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "HT";

                                case "p2" : return "FEM";

                                case "p3" : return "DME";

                                case "p4" : return "AE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "HT / FEA LAB";

                                case "p7" : return "HT / FEA LAB";

                                case "p8" : return "HT / FEA LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "FEM";

                                case "p2" : return "DME";

                                case "p3" : return "P";

                                case "p4" : return "P";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "AE";

                                case "p7" : return "HT";

                                case "p8" : return "CIM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DME";

                                case "p2" : return "HT / FEA LAB";

                                case "p3" : return "HT / FEA LAB";

                                case "p4" : return "HT / FEA LAB";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OE";

                                case "p7" : return "HT";

                                case "p8" : return "FEM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "FEM";

                                case "p2" : return "DME";

                                case "p3" : return "OE";

                                case "p4" : return "HT";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "HT / FEA LAB";

                                case "p7" : return "HT / FEA LAB";

                                case "p8" : return "HT / FEA LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "OE";

                                case "p2" : return "FEM";

                                case "p3" : return "CIM";

                                case "p4" : return "DME";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "FEM";

                                case "p7" : return "HT";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "HT / FEA LAB";

                                case "p2" : return "HT / FEA LAB";

                                case "p3" : return "HT / FEA LAB";

                                case "p4" : return "AE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "HT";

                                case "p7" : return "DME";

                                case "p8" : return "CIM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DME";

                                case "p2" : return "HT";

                                case "p3" : return "CIM";

                                case "p4" : return "AE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DME";

                                case "p7" : return "P";

                                case "p8" : return "P";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "FEM";

                                case "p2" : return "HT";

                                case "p3" : return "AE";

                                case "p4" : return "FEM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OE";

                                case "p7" : return "CIM";

                                case "p8" : return "ENGLISH";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("4th year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "PW";

                                case "p2" : return "PW";

                                case "p3" : return "PW";

                                case "p4" : return "PW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "PW";

                                case "p2" : return "PW";

                                case "p3" : return "PW";

                                case "p4" : return "PW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "BIO / AE";

                                case "p2" : return "CE";

                                case "p3" : return "BIO / AE";

                                case "p4" : return "CE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OM";

                                case "p7" : return "PPE";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "PPE";

                                case "p2" : return "OM";

                                case "p3" : return "BIO / AE";

                                case "p4" : return "PPE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SEMINAR";

                                case "p7" : return "SEMINAR";

                                case "p8" : return "SEMINAR";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "OM";

                                case "p2" : return "CE";

                                case "p3" : return "PPE";

                                case "p4" : return "BIO / AE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CE";

                                case "p7" : return "OM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "PW";

                                case "p2" : return "PW";

                                case "p3" : return "PW";

                                case "p4" : return "PW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "PW";

                                case "p2" : return "PW";

                                case "p3" : return "PW";

                                case "p4" : return "PW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PW";

                                case "p7" : return "PW";

                                case "p8" : return "PW";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "BIO / AE";

                                case "p2" : return "PPE";

                                case "p3" : return "BIO / AE";

                                case "p4" : return "CE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PPE";

                                case "p7" : return "OM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "OM";

                                case "p2" : return "CE";

                                case "p3" : return "BIO / AE";

                                case "p4" : return "CE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PPE";

                                case "p7" : return "OM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "PPE";

                                case "p2" : return "OM";

                                case "p3" : return "CE";

                                case "p4" : return "BIO / AE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "SEMINAR";

                                case "p7" : return "SEMINAR";

                                case "p8" : return "SEMINAR";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return "";

                                case "p2" : return "";

                                case "p3" : return "";

                                case "p4" : return "";

                                case "p5" : return "";

                                case "p6" : return "";

                                case "p7" : return "";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }

            }
        }
        return "Data Not Available";
    }
}
