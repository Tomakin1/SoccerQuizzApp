package com.example.yunusproje

import com.example.yunusproje.Question

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "2018 FIFA Dünya Kupası'nı hangi ülke kazandı??",
            R.drawable.ic_flag_of_argentina,
            arrayListOf("Fransa", "Hırvatistan", "Brezilya", "Almanya"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Futbolun 'Kralı' olarak bilinen futbolcu kimdir?",
            R.drawable.ic_flag_of_australia,
            arrayListOf("Lionel Messi", "Cristiano Ronaldo",
                "Pele", "Diego Maradona"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "UEFA Şampiyonlar Ligi'ni en çok kazanan takım hangisidir?",
            R.drawable.ic_flag_of_brazil,
            arrayListOf("Barcelona", "Real Madrid",
                "Bayern Münih", "Liverpool"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Hangi takımın stadyumu Camp Nou'dur?",
            R.drawable.ic_flag_of_belgium,
            arrayListOf("Real Madrid", "Barcelona",
                "Manchester United", "Bayern Münih"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Premier League'de \"Red Devils\" olarak bilinen takım hangisidir?",
            R.drawable.ic_flag_of_fiji,
            arrayListOf("Liverpool", "Chelsea",
                "Manchester United", "Arsenal"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "2014 FIFA Dünya Kupası finalinde Almanya hangi ülkeyi yenerek şampiyon oldu??",
            R.drawable.ic_flag_of_germany,
            arrayListOf("Arjantin", "Brezilya",
                "Hollanda", "İtalya"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Messi hangi ülkede doğdu?",
            R.drawable.ic_flag_of_denmark,
            arrayListOf("İspanya", "Brezilya",
                "Arjantin", "Portekiz"),
            2
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Cristiano Ronaldo'nun forma numarası nedir?",
            R.drawable.ic_flag_of_india,
            arrayListOf("7", "10",
                "11", "9"),
            0
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Süper Lig'de en çok şampiyon olan takım hangisidir?",
            R.drawable.ic_flag_of_new_zealand,
            arrayListOf("Beşiktaş", "Fenerbahçe",
                "Galatasaray", "Trabzonspor"),
            2
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "FIFA Dünya Kupası tarihinde en çok gol atan oyuncu kimdir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Ronaldo Nazário", "Miroslav Klose",
                "Gerd Müller", "Just Fontaine"),
            1
        )
        questionsList.add(questionTen)
        // 11
        val questionEleven = Question(
            11,
            "UEFA Avrupa Ligi'ni en çok kazanan takım hangisidir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Sevilla", "Liverpool",
                "Juventus", "Chelsea"),
            0
        )
        questionsList.add(questionEleven)
        // 12

        val questionTwelve = Question(
            12,
            "FIFA tarafından 2020 yılında yılın en iyi oyuncusu kim seçildi?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Lionel Messi", "Cristiano Ronaldo",
                "Robert Lewandowski", "Neymar"),
            2
        )
        questionsList.add(questionTwelve)
        //13
        val questionThirteen = Question(
            13,
            "Euro 2016'nın şampiyonu hangi ülkedir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Almanya", "İspanya",
                "Portekiz", "Fransa"),
            2
        )
        questionsList.add(questionThirteen)
        //14
        val questionFourteen = Question(
            14,
            "İspanya La Liga'da en çok gol atan oyuncu kimdir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Lionel Messi", "Cristiano Ronaldo",
                "Raúl", "Telmo Zarra"),
            0
        )
        questionsList.add(questionFourteen)
        //15
        val questionFifteen = Question(
            15,
            "Hangi takım \"Gunners\" olarak bilinir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Chelsea", "Arsenal",
                "Tottenham Hotspur", "West Ham United"),
            1
        )
        questionsList.add(questionFifteen)
        val questionSixteen = Question(
            16,
            "Türkiye'de \"Kral\" lakaplı futbolcu kimdir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Hakan Şükür", "Rıdvan Dilmen",
                "Tanju Çolak", "Metin Oktay"),
            2
        )
        questionsList.add(questionSixteen)
        val questionSeventeen = Question(
            17,
            "Barcelona'nın 2009 yılında kazandığı 6 kupa arasında hangisi yoktur?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("UEFA Şampiyonlar Ligi", "La Liga",
                "FIFA Dünya Kulüpler Kupası", "Euro 2008"),
            3
        )
        questionsList.add(questionSeventeen)
        val questionEighteen = Question(
            18,
            "2010 FIFA Dünya Kupası'na ev sahipliği yapan ülke hangisidir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Brezilya", "Almanya",
                "Güney Afrika", "Japonya"),
            2
        )
        questionsList.add(questionEighteen)
        val questionNineteen = Question(
            19,
            "Galatasaray'ın UEFA Kupası'nı kazandığı yıl hangisidir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("2000", "1998",
                "2002", "1996"),
            0
        )
        questionsList.add(questionNineteen)
        val questionTwenty = Question(
            20,
            "Beşiktaş'ın 2016-2017 sezonunda UEFA Avrupa Ligi'nde çeyrek finalde elendiği takım hangisidir?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Lyon", "Ajax",
                "Manchester United", "Celta Vigo"),
            0
        )
        questionsList.add(questionTwenty)

        return questionsList
    }
}