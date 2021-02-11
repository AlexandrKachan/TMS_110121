public class Exersice18 {
    //Посчитать количество запятых, точек и тире в строке. Найти другие знаки препинания, посчитать их количество.


    public static void main(String[] args) {

        String str = " Республиканский центр по гидрометеорологии, контролю радиоактивного загрязнения и мониторингу " +
                "окружающей среды распространил предупреждение о неблагоприятном метеорологическом явлении — " +
                "заметном похолодании.\n Объявлен оранжевый уровень опасности!\n" +
                "По Беларуси 8 февраля, в понедельник, в ночные и утренние часы в центральных и северо-восточных районах " +
                "минимальная температура воздуха понизится до −25…28. \n В дневные часы по юго-западу ожидается усиление" +
                " восточного ветра порывами до 15−20 м/с, \n сильный снег, метель, на дорогах снежные заносы.\n" +
                "По Минской области: 8 февраля в ночные и утренние часы во многих районах области минимальная " +
                "температура воздуха понизится до −25…28.\n" +
                "По Минску в понедельник минимальная температура воздуха в окрестностях города составит −25…27.\n";
        int n = 0;
        char symbol;
        for (int i= 0; i<str.length(); i++){

            symbol=str.charAt(i); //Возвращает символ, находящийся в указаной циклом позиции. Разобрали предложение на символы.

            if (symbol == ','||symbol == '.' || symbol == '-' || symbol == '/' || symbol == '!'){
                n++;
            }
        }
        System.out.println( "У нас есть " + n + " знаков препинания");
        System.out.println( str);




    }




}