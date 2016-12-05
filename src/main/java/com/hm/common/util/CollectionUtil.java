/**
 * 
 */
package com.hm.common.util;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 * @author shishun.wang
 * @date 2016年11月28日 上午10:14:07
 * @version 1.0
 * @describe
 */
public class CollectionUtil extends CommonUtil {

	/**
	 * @param collection
	 * @return false:当前集合不为空并且元素长度不等于0
	 */
	public static boolean isCollectionBlank(List<?> collection) {
		if (isEmpty(collection)) {
			return true;
		}
		return collection.size() == 0;
	}

	@SafeVarargs
	public static final <T> Set<T> toSet(T... paramm) {
		/*HashSet<T> set = new HashSet<>(paramm.length);
		for (T parameter : paramm) {
			set.add(parameter);
		}
		return set;*/
		
		return null;
	}

	public static final <T> List<T> distinct(List<T> list, Comparator<T> comparator) {
		/*if (isEmpty(list)) {
			return Collections.emptyList();
		}
		List<T> targetList = new ArrayList<>();
		list.stream().filter(item -> item != null).forEach(item -> {
			Optional<T> tryFind = targetList.parallelStream()
					.filter(targetItem -> comparator.compare(item, targetItem) == 0).findAny();
			if (!tryFind.isPresent()) {
				targetList.add(item);
			}
		});
		return targetList;*/
		
		return null;
	}

	public static final <T> List<T> distinct(List<T> list) {
		/*if (isEmpty(list)) {
			return Collections.emptyList();
		}
		return list.stream().distinct().collect(Collectors.toList());*/
		
		return null;
	}
}
