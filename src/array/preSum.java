package array;

public class preSum {
	
	// ����ǰ׺�͵�����
	private int preSum[];

	/* ����һ�����飬����ǰ׺�� */
	public preSum(int[] arr) {
		preSum = new int[arr.length + 1];
		// ����ǰ׺��:�±����ǰn����֮��
		for (int i = 1; i < preSum.length; i++) {
			preSum[i] = preSum[i - 1] + arr[i - 1];
		}
	}

	/* ��ѯ������[i,j]���ۼӺ� */
	public int sumRange(int left, int right) {
		return preSum[right + 1] - preSum[left];
	}
	
}
