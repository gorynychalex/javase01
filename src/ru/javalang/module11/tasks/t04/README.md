#Условие
Одной из классических задач при работе с текстом является частотный анализ.

###Используя Java Stream API, составьте "рейтинг" слов исходного текста по их количеству в тексте (по убыванию) и верните первые 'N' позиций.

Слова, встречающиеся одинаковое количество раз, должны быть отсортированы лексикографически.

При решении задачи используйте следующий класс:

````
public class Main
{
  public static String[] rate(int n, String data)
  {
    // Ваш код
  }
}
````
### Формат входных данных
На вход вашей функции подается String слов, которые вместе представляют анализируемый вами текст

Все слова преобразованы к нижнему регистру.

###Формат выходных данных
Код решения должен содержать класс Main с реализацией функции rate.

Каждая строка выходного потока должна быть отформатирована в следующем виде: 
#### [слово] [количество]

###Ограничения
1  ≤  N  ≤ 100