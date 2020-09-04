from disk import Disk


class Tower:

    # Constructor. which will be called during construction
    # which is Tower("some title")
    def __init__(self, title):  
        self.disk_bag = []
        self.title = title      # automatially adding a property to object

    def add_disk(self, disk):

        if len(self.disk_bag) == 0:
            self.disk_bag.append(disk)  # if no disks , we can add any disk
            return
        
        # get top disk size
        # get input disk size
        # if input disk size > top disk size
            # raise error
        total_disks = len(self.disk_bag)
        top_disk = self.disk_bag[total_disks-1]
        top_disk_size = top_disk.get_size()
        coming_disk_size = disk.get_size()

        if coming_disk_size > top_disk_size:
            raise ValueError(f"{self.title} disk:{coming_disk_size} cannot go on to {top_disk_size}")

        self.disk_bag.append(disk)

    def remove_disk(self):
        if len(self.disk_bag) == 0:
            raise ValueError(f'tower {self.title} does not have any disks to move.')

        # get the top disk
        total_disks = len(self.disk_bag)
        topDisk = self.disk_bag[total_disks-1]
        self.disk_bag.remove(topDisk)
        return topDisk

    def get_numberof_disks(self):
        return len(self.disk_bag)

    def drawPole(self):
        for x in range(1, 5, 1):
            print('                       |')

    def drawBase(self):
        print('           ---------------------')

    def drawTitle(self):
        print(f"                    {self.title}")

    def draw(self):
        # pole
        self.drawPole()

        # drawing disks
        for disk in self.disk_bag[::-1]:    # walking reverse
            disk.draw()

        # now base
        self.drawBase()

        # title now.
        self.drawTitle()
