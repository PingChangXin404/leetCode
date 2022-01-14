package array;
/**
 * leetCode26��ɾ�����������е��ظ���
 * ˫ָ���Ӧ��
 * @author ����᰺
 *
 */
public class deleteRepeatNumbers {
	
	/**
	 * ����ָ�룺��ͬ�������������ָ���ֵ������ָ���ֵ�����ƶ���ָ��
	 * ֱ���ҵ������ظ���ֵ�����ƶ���ָ�룬�ٽ���ָ���ֵ��ֵ����ָ�롣
	 * ���ƶ���ָ������ã�
	 * 1.������ΪҪ����ָ���ҵ��Ĳ����ظ���ֵ��ֵ����ָ�룬����ͬʱ�ƶ���
	 * 2.�����һ�������ظ������Ǹ�ֵ����һ���ˡ�
	 */
	
	public int removeDuplicates(int[] nums) {
		int fast = 0, slow = 0;
		while (fast != nums.length) {
			if (nums[slow] != nums[fast]) {
				slow++;
				nums[slow] = nums[fast];
			}
			fast++;
		}
		// ���鳤�� = ����+1
		return slow + 1;
	}

}
