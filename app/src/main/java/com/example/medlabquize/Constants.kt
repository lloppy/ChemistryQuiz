package com.example.medlabquize

object Constants {

    const val TOTAL_QUESION:String ="Всего вопросов"
   const val CORRECT_ANSWER:String ="Правильный ответ"
    const val USERNAME:String="Имя"
//    const val CORRECT_ANSWER:Int =0

    fun fetchQuestions():ArrayList<Questions>{
        val questionList=ArrayList<Questions>()
       //implement the questions

        val quest1=Questions(
            1,
                "Среди приведённых химических реакций к окислительно-восстановительным НЕ ОТНОСИТСЯ реакция",
             3,
            "1) Cu + H2SO4 ⟶ CuSO4 + SO2 + H2O  \n",
            "2) Al + S ⟶ Al2S3  \n",
            "3) CuO + H2SO4 ⟶ CuSO4 + H2O \n",
            "4) Na + H2O ⟶ NaOH + H2"

        )
        questionList.add(quest1)

        val  quest2=Questions(
            2,
            "Хром является окислителем в реакции, схема которой\n",

            3,
            "1) K2Сr2O7 + KОН -> К2Сr4 + н2O\n",
            "2) К2СrO4 + H2S04 —> К2Сr2O7 + K2SO4 + Н2O\n",
            "3) К2Сr2O7 + KL + H2SO4 —> K2SO4 + I2 + Cr2(SO4)3\n",
            "4) KСrO2 + Br2 + КОН —> KBr + К2СrO4 + H2O\n"

        )
        questionList.add(quest2)

        val quest3=Questions(
            3,
            "Сокращённое ионное уравнение 2Н+ + S2- = H2S соответствует взаимодействию\n",
            3,
            "1) H2S и NaOH\n",
            "2) S и Н2\n",
            "3) НСl и FeS\n",
            "4) H2SO4 и (NH4)2S\n"
        )
        questionList.add(quest3)

        val quest4=Questions(
            4,
            "К дисперсным системам не относят\n",
            4,
            "1) истинные растворы\n",
            "2) коллоидные растворы\n",
            "3) суспензии\n",
            "4) сложные вещества\n"
        )
        questionList.add(quest4)

        val quest5=Questions(
            5,
            "К аэрозолям относят\n",
            4,
            "1) истинные растворы\n",
            "2) гели\n",
            "3) воду\n",
            "4) туман\n"
        )
        questionList.add(quest5)



        val quest6=Questions(
            6,
            "Для приготовления насыщенного раствора поваренной соли надо в 100 г воды растворить 36 г NaCl. Какое количество (моль) поваренной соли будет растворено в 270 г насыщенного раствора?\n" +
                    "\n" +
                    "Ответ запишите с точностью до десятых долей",
            1,
            "1,2",
            "3,2",
            "3,6",
            "0,2"
        )
        questionList.add(quest6)

        val quest7=Questions(
            7,
            "Слипание коллоидных частиц - ",
            3,
            "Агрегация",
            "Умножение",
            "Коагуляция",
            "Сложение"
        )
        questionList.add(quest7)



        val quest8=Questions(
            8,
            "Движение коллоидных частиц в электрическом поле - ",
            1,
            "Электрофорез",
            "Броуновское движение",
            "Опал",
            "Электроосмос"
        )
        questionList.add(quest8)


        val quest9=Questions(
            9,
            "Грубодисперсная система, в которой одна жидкость в виде капель распределена в другой - \n ",
            4,
            "Золи",
            "Суспензии",
            "Опалесценция",
            "Эмульсия"
        )
        questionList.add(quest9)

        val quest10=Questions(
            10,
            "Грубодисперсная система, в которой твёрдые частицы распределены в жидкости -  ",
            4,
            "Золи",
            "Эмульсии",
            "Пена",
            "Суспензия"
        )
        questionList.add(quest10)


        val quest11=Questions(
            11,
            "Процесс оседания крупных частиц дисперсной фазы - ",
            1,
            "Седиментация",
            "Суспензия",
            "Опалесценция",
            "Эмульсия"
        )
        questionList.add(quest11)


        val quest12=Questions(
            12,
            "Движение коллоидных частиц в электрическом поле - ",
            1,
            "Электрофорез",
            "Электроосмос",
            "Движение",
            "Движение частиц в эл-ом поле"
        )
        questionList.add(quest12)



        val quest13=Questions(
            13,
            "... - образования из двух или большего числа фаз, которые практически не смешиваются и не реагируют друг с другом химически",
            2,
            "Дисперсная фаза",
            "Дисперсная система",
            "Дисперсная среда",
            "Компоненты"
        )
        questionList.add(quest13)





        val quest14=Questions(
            14,
            " - дисперсная система, состоящая из твердых или жидких частиц, взвешенных в газообразной среде",
            1,
            "Аэрозоль",
            "Эмульсии",
            "Суспензии",
            "Пена"
        )
        questionList.add(quest14)




        val quest15=Questions(
            15,
            "... - высокодисперсная коллоидная система с жидкой или газообразной дисперсионной средой, в объёме которой распределена другая фаза в виде капелек жидкости, пузырьков газа или мелких твёрдых частиц ",
            3,
            "Гели",
            "Пена",
            "Золь",
            "Студни"
        )
        questionList.add(quest15)




        return questionList
    }
}