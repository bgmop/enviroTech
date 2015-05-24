package com.swd.project;
import java.io.Serializable;
import java.util.TreeSet;

/**
 * Park represents a park.
 */

public class Park implements Serializable, Comparable<Park> {

	/** The park id. */
	private int parkId;

	/** The park name. */
	private String parkName;

	/** The park manager. */
	private ParkManager parkManager;

	/** The jobs. */
	private TreeSet<Job> jobs;

	/**
	 * Instantiates a new park with the park id and the park manager.
	 */
	public Park(int parkId, String parkName, ParkManager parkManager) {
		// instantiate set of jobs
		// set park id
		// set park manager
		// add this park to the park manager's list of parks
		jobs = new TreeSet<Job>();
		this.parkId = parkId;
		this.parkName = parkName;
		this.parkManager = parkManager;
		this.parkManager.addPark(this);

	}

	/**
	 * Sets the park name.
	 * 
	 * @param parkName
	 *            the new park name
	 */
	public void setParkName(String parkName) {
		// set park name
		this.parkName = parkName;
	}

	/**
	 * Sets the park manager.
	 * 
	 * @param parkManager
	 *            the new park manager
	 */
	public void setParkManager(ParkManager parkManager) {
		// set park manager
		this.parkManager = parkManager;
	}

	/**
	 * Gets the park name.
	 * 
	 * @return the park name
	 */
	public String getParkName() {
		// return park name
		return parkName;
	}

	/**
	 * Gets the park manager.
	 * 
	 * @return the park manager
	 */
	public ParkManager getParkManager() {
		// return park manager
		return parkManager;
	}

	/**
	 * Adds the job.
	 * 
	 * @param job
	 *            the job
	 * @return true, if successful
	 */
	public boolean addJob(Job job) {
		// return the result of adding the job to the set of jobs

		jobs.add(job);

		return false;
	}

	/**
	 * Gets the jobs.
	 * 
	 * @return the jobs
	 */
	public TreeSet<Job> getJobs() {
		// return the set of jobs
		return jobs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + parkId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Park other = (Park) obj;
		if (parkId != other.parkId)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Park o) {
		// compare by park name so any treeset collection of parks are sorted by
		// park name
		// if (this.parkName.equals(o.parkName)) return 0;
		if (this.equals(o))
			return 0;
		else if (this.parkName.hashCode() > o.parkName.hashCode())
			return 1;
		else
			return -1;

	}

}
