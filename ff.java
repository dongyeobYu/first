import javax.sound.midi.Soundbank;
import java.util.*;

class ff{
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));

        String[] participant1 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion1 = {"stanko", "ana", "mislav"};

        Solution s = new Solution();
        s.solution(participant, completion);
        System.out.println(s.solution(participant, completion));


    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i< participant.length; i++){
            for(int j=i; j< completion.length; j++){
                if(participant[i] != completion[j]){
                    answer = participant[i];
                    return answer;
                }
            }
        }


        return answer;
    }
}