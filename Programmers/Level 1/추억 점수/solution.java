import java.util.HashMap;

class solution {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        // 이름과 그리움 점수를 키와 값으로 하는 HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();
        // 결과 정수 배열 생성
        int[] result = new int[photo.length];

        // HashMap 키와 값 넣기
        for (int i = 0; i< name.length; i++){
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i< photo.length; i++){
            // photo의 배열을 순서대로 가져옴
            String[] arr = photo[i];

            for (int j = 0; j< arr.length; j++){

                String person = arr[j];
                // map의 키에 person이 있을 경우
                if (map.containsKey(person)){
                    // 결과 배열에 점수 추가
                    result[i] += map.get(person);
                }
            }
        }
        return result;
    }

}
