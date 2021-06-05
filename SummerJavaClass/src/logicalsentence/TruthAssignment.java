package logicalsentence;

public class TruthAssignment {
	private String[] props;
	private boolean[] vals;

	TruthAssignment(String[] ps, boolean[] vs) {
		props = ps.clone();
		vals = vs.clone();
	}

	public boolean getValue(String pc) {
		for (int i = 0; i < props.length; i++) {
			if (pc.equals(props[i])) {
				return vals[i];
			}
		}
		return false;
	}

}
