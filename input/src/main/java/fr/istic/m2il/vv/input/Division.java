package fr.istic.m2il.vv.input;

public class Division implements Operation {

	private double firstMember;
	private double secondMember;

	public Division(double firstMember, double secondMember) {
		this.firstMember = firstMember;
		this.secondMember = secondMember;
	}

	@Override
	public void setFirstMember(double firstMember) {
		this.firstMember = firstMember;
	}

	@Override
	public void setSecondMember(double secondMember) {
		this.secondMember = secondMember;
	}

	@Override
	public double getFirstMember() {
		return this.firstMember;
	}

	@Override
	public double getSecondMember() {
		return this.secondMember;
	}

	@Override
	public double operate() {
		return (getFirstMember() / getSecondMember());
	}
}
