package com.esra.myapplication;


public class Questions {

    public String mQuestions[]= {

            "Window=...",
            "kitap=....",
            "The moon is...cold",
            "Tehlikeli=.....",
            "Speech=....",
            "Constantly=...",
            "Devasa=....",
            "Yaklaşık olarak=....",
            "tepe noktası=....",
            "Breach=....",
            "Bewilder=...",
            "Samimi=..."
    };

    private String mChoices[][]={
            {"kapı","pencere","mutfak","ev"},
            {"pencil","duster","book","eraser"},
            {"always","often","usually","never"},
            {"Dangerous","Easy","Fork","Frosty"},
            {"döndürmek","getirmek","umut","konuşma"},
            {"Sürekli","Yavaşça","hızlıca","sakince"},
            {"Horrible","Enormous","Mad","Helmet"},
            {"partly","unfriendly","definitely","approximately"},
            {"Gallant","Eloquent","Pinnacle","Amplitude"},
            {"Kabul etmek","Katletmek","Pes etmek","İhlal etmek"},
            {"Şaşırtmak","Soğutmak","Ayırmak","Kovulmak"},
            {"Avert","Drastic","Candid","Erratic"}
    };

    private String mCorrectAnswers[]={"is", "Is","are","Is","He always wakes up at 7:00 am","didn't have","is going to","to get","How far",};

    public String getmQuestions(int a) {
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice=mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice=mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice=mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice=mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }
}


