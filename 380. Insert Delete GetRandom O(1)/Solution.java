class RandomizedSet {
    private Set<Integer> set;
    private List<Integer> list;

    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }

    public boolean search(int val) {
        return set.contains(val);
    }
    
    public boolean insert(int val) {
        if (set.contains(val)) return false;
        set.add(val);
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!set.contains(val)) return false;
        set.remove(val);
        list.remove(new Integer(val));
        return true;
    }
    
    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */